package com.mt4e.dev.demo;

import lombok.Data;

@Data
public class UserDto {

	private String userName;
	private String password;
	
	public UserDto(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
}
