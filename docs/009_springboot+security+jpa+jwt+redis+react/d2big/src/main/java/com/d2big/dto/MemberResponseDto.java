package com.d2big.dto;

import com.d2big.entity.Member;
import lombok.Getter;

@Getter
public class MemberResponseDto {
    private Long id;
    private String username;
    private String nickname;
    private String email;

    public MemberResponseDto(Member member) {
        this.id = member.getId();
        this.username = member.getUsername();
        this.nickname = member.getNickname();
        this.email = member.getEmail();
    }
}
