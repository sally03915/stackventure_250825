package com.d2big.entity;

import lombok.Getter;

@Getter
public enum Role {
	ADMIN("ADMIN"), MEMBER("MEMBER");
	
	private String value;
	private Role(String value) { this.value = value; }

}
