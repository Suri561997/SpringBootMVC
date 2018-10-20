package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDeatailsDAO;
import com.example.demo.model.StudentDetails;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDeatailsDAO  studentDeatailsDAO; 
	
	@Override
	public List<StudentDetails> getAllStudentDetails() {
		return studentDeatailsDAO.getAllStudentDetails();
	}

	@Override
	public boolean isStudentExist(StudentDetails studentDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void saveStudent(StudentDetails studentDetails) {
		// TODO Auto-generated method stub
		
	}

}
