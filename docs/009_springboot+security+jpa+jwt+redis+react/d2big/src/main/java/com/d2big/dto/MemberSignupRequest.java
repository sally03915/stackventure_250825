package com.d2big.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberSignupRequest {
    private String username;
    private String password;
    private String email;
    private String nickname;
    private String provider; // "kakao", "google", "naver", "thejoa" 등
}
