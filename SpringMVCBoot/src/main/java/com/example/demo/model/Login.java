package com.example.demo.model;

import java.io.Serializable;
@Entity
@Table(name = "login_details")
public class Login implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "user_name")
	private String UserName;
	
	@Column(name = "password")	
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
