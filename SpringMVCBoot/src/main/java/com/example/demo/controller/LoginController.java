package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Login;
import com.example.demo.model.StudentDetails;
import com.example.demo.services.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	private static final Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value = "validateCredentials", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Void> validateCredentials(@ModelAttribute("login") Login login) {
		System.out.println(login.getPassword());
		System.out.println(login.getUserName());
	int count = loginService.validateCredentials(login);
	System.out.println("Controller result.."+count);
	ResponseEntity<Void> response = null;
	if(count != 0 && count == 1 ) {
		response = new ResponseEntity<>(HttpStatus.OK);
	}
	else {
		response = new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
	}
		return response;
	}
	
	@RequestMapping(value = "showSuccessPage", method = RequestMethod.GET)
	public ModelAndView showSuccessPage(ModelAndView modelAndView,StudentDetails studentDetails) {
		log.info("Controller entered into showSuccessPage........ {}");
		modelAndView.addObject("stdDetails", studentDetails);
		modelAndView.setViewName("loginSuccess");
		return modelAndView;
	}
	
}
