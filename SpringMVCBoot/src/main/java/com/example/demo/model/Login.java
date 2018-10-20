package com.example.demo.model;

import java.io.Serializable;

public class Login implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String UserName;
	
	private String password;

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
