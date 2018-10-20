package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.StudentDetails;

public interface StudentDeatailsDAO {
	
	public List<StudentDetails> getAllStudentDetails();
	
	public boolean isStudentExist(StudentDetails studentDetails);

	public int saveStudent(StudentDetails studentDetails);
	
	
}
