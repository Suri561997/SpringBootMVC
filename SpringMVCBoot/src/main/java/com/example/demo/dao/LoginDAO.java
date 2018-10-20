package com.example.demo.dao;

import com.example.demo.model.Login;

public interface LoginDAO {
	
	public int validateCredentials(Login login);
	
}
