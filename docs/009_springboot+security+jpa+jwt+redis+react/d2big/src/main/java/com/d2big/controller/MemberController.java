package com.d2big.controller;
 

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import org.springframework.security.core.Authentication; 


import com.d2big.dto.MemberLoginRequest;
import com.d2big.dto.MemberResponseDto;
import com.d2big.dto.MemberSignupRequest;
import com.d2big.dto.TokenResponse;
import com.d2big.entity.Member;
import com.d2big.service.MemberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    // 회원가입
    @PostMapping("/signup")
    public ResponseEntity<Member> signup(@RequestBody MemberSignupRequest request) {
        Member member = memberService.signup(request);
        return ResponseEntity.ok(member);
    }

    // 로그인
    @PostMapping("/login")
    public ResponseEntity<TokenResponse> login(@RequestBody MemberLoginRequest request) {
        TokenResponse tokens = memberService.login(request);
        return ResponseEntity.ok(tokens);
    }

    // 로그아웃
    @PostMapping("/logout")
    public ResponseEntity<Void> logout(@RequestHeader("Authorization") String accessToken) {
        String username = extractUsernameFromToken(accessToken);
        memberService.logout(username);
        return ResponseEntity.ok().build();
    }

    // 토큰 재발급
    @PostMapping("/reissue")
    public ResponseEntity<TokenResponse> reissue(@RequestHeader("Authorization") String refreshToken) {
        TokenResponse newTokens = memberService.reissue(refreshToken);
        return ResponseEntity.ok(newTokens);
    }

    // JWT에서 username 추출 (JwtUtil을 직접 사용하거나 SecurityContext에서 가져올 수도 있음)
    private String extractUsernameFromToken(String token) {
        // "Bearer ..." 형식 처리
        if (token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        return memberService.getUsernameFromToken(token); // JwtUtil을 내부에서 호출
    }
    //////////////////////////
    @GetMapping("/me")
    public ResponseEntity<MemberResponseDto> getMyPage(Authentication authentication) {
        String username = authentication.getName();
        MemberResponseDto response = memberService.getMyInfo(username);
        return ResponseEntity.ok(response);
    }
}
