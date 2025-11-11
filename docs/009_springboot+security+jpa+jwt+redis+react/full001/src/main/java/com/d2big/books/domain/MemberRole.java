package com.d2big.books.domain;

import lombok.Getter;

@Getter
public enum MemberRole {
	ADMIN("ROLE_ADMIN"), MEMBER("ROLE_MEMBER");
	
	private String value;
	private MemberRole(String value) { this.value = value; }

}
