package com.d2big.service;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.d2big.dto.MemberLoginRequest;
import com.d2big.dto.MemberResponseDto;
import com.d2big.dto.MemberSignupRequest;
import com.d2big.dto.TokenResponse;
import com.d2big.entity.Member;
import com.d2big.entity.Role;
import com.d2big.repository.MemberRepository;
import com.d2big.util.JwtUtil;
import com.d2big.util.RedisUtil;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;
    private final RedisUtil redisUtil;

    // 회원가입
    public Member signup(MemberSignupRequest request) {
        if (memberRepository.findByUsername(request.getUsername()).isPresent()) {
            throw new IllegalArgumentException("이미 사용 중인 아이디입니다.");
        }

        Member member = Member.builder()
            .username(request.getUsername())
            .password(passwordEncoder.encode(request.getPassword()))
            .email(request.getEmail())
            .nickname(request.getNickname())
            .image("/images/thejoa.png")
            .role(Role.MEMBER)
            .provider(request.getProvider()) // null 또는 "kakao", "google"
            .build();

        return memberRepository.save(member);
    }

    // 로그인
    public TokenResponse login(MemberLoginRequest request) {
        Member member = memberRepository.findByUsername(request.getUsername())
            .orElseThrow(() -> new BadCredentialsException("아이디 또는 비밀번호가 일치하지 않습니다."));

        if (!passwordEncoder.matches(request.getPassword(), member.getPassword())) {
            throw new BadCredentialsException("아이디 또는 비밀번호가 일치하지 않습니다.");
        }

        String accessToken = jwtUtil.generateAccessToken(member);
        String refreshToken = jwtUtil.generateRefreshToken(member);

        redisUtil.saveRefreshToken(member.getUsername(), refreshToken, jwtUtil.getRefreshTokenExpiration());

        return new TokenResponse(accessToken, refreshToken);
    }

    // 로그아웃
    public void logout(String username) {
        redisUtil.deleteRefreshToken(username);
    }

    // 토큰 재발급
    public TokenResponse reissue(String refreshToken) {
        String username = jwtUtil.extractUsername(refreshToken);
        String storedToken = redisUtil.getRefreshToken(username);

        if (!refreshToken.equals(storedToken)) {
            throw new IllegalArgumentException("유효하지 않은 Refresh Token입니다.");
        }

        Member member = memberRepository.findByUsername(username)
            .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));

        String newAccessToken = jwtUtil.generateAccessToken(member);
        String newRefreshToken = jwtUtil.generateRefreshToken(member);

        redisUtil.saveRefreshToken(username, newRefreshToken, jwtUtil.getRefreshTokenExpiration());

        return new TokenResponse(newAccessToken, newRefreshToken);
    }

    // 회원 조회
    public Member findByUsername(String username) {
        return memberRepository.findByUsername(username)
            .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));
    }

    public Member findById(Long id) {
        return memberRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));
    }

    // 회원 삭제
    public void delete(Long id, String password) {
        Member member = memberRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));

        if (!passwordEncoder.matches(password, member.getPassword())) {
            throw new BadCredentialsException("비밀번호가 일치하지 않습니다.");
        }

        memberRepository.deleteById(id);
    }

    // 비밀번호 변경
    public void changePassword(Long id, String oldPassword, String newPassword) {
        Member member = memberRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));

        if (!passwordEncoder.matches(oldPassword, member.getPassword())) {
            throw new BadCredentialsException("기존 비밀번호가 일치하지 않습니다.");
        }

        member.setPassword(passwordEncoder.encode(newPassword));
        memberRepository.save(member);
    }
    
    public String getUsernameFromToken(String token) {
        return jwtUtil.extractUsername(token);
    }
    //////////////////////////  사용자 정보 조회 메서드
    public MemberResponseDto getMyInfo(String username) {
        Member member = memberRepository.findByUsername(username)
            .orElseThrow(() -> new IllegalArgumentException("사용자 정보를 찾을 수 없습니다."));
        return new MemberResponseDto(member);
    }

}
