package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LoginDAO;
import com.example.demo.model.Login;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDAO logindao;
	
	public int validateCredentials(Login login) {
		return logindao.validateCredentials(login);
	}

}
