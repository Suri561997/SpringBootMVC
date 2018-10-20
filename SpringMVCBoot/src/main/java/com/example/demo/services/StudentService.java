package com.example.demo.services;

import java.util.List;

import com.example.demo.model.StudentDetails;

public interface StudentService {

	public List<StudentDetails> getAllStudentDetails();

	public boolean isStudentExist(StudentDetails studentDetails);

	public int saveStudent(StudentDetails studentDetails);
	
}
