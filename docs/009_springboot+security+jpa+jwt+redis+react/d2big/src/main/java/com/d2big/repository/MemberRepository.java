package com.d2big.repository;

import com.d2big.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // username으로 조회 (로그인, 인증에 사용)
    Optional<Member> findByUsername(String username);

    // 이메일로 조회 (소셜 로그인이나 중복 체크에 사용)
    Optional<Member> findByEmail(String email);

    // 닉네임 중복 체크
    boolean existsByNickname(String nickname);

    // 아이디 중복 체크
    boolean existsByUsername(String username);

    // 비밀번호 변경 (조건: 기존 비밀번호 일치 시)
    @Modifying
    @Query("UPDATE Member m SET m.password = :newPassword WHERE m.id = :id AND m.password = :oldPassword")
    int updatePasswordByIdAndOldPassword(Long id, String newPassword, String oldPassword);

    // 삭제는 기본 제공: deleteById(Long id)
    // 전체 조회는 기본 제공: findAll()
    // ID로 조회는 기본 제공: findById(Long id)
}
