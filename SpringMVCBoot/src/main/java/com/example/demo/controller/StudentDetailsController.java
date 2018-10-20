package com.example.demo.controller;

import java.util.List;

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

import com.example.demo.model.StudentDetails;
import com.example.demo.services.StudentService;

@Controller
public class StudentDetailsController {
	
	@Autowired
	private StudentService studentService;
	
	
	private static final Logger log = LoggerFactory.getLogger(StudentDetailsController.class);

	
	@RequestMapping(value = "getAllstudentDetails", method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public List<StudentDetails> getStudentDetails() {
		log.info("Controller Entered into getStudentDetails method...");
	List<StudentDetails> list = studentService.getAllStudentDetails(); 
	System.out.println("Student Details Size.. in Controoler..."+list.size());
		return list;
	}
	
	@RequestMapping(value = "createStudent",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> createStudent(@ModelAttribute("studentDetails") StudentDetails studentDetails){
		System.out.println("----------"+studentDetails.getStudentName());
		/*if(studentService.isStudentExist(studentDetails)) {
			log.error("Unable to create. A Student with ID {} already exist,"+studentDetails.getStudentID());
			return new ResponseEntity<String>("",HttpStatus.CONFLICT);
		}*/
		
		studentService.saveStudent(studentDetails);
		
		return new ResponseEntity<String>("Student Added Successfully.", HttpStatus.CREATED);
	}
	
}
