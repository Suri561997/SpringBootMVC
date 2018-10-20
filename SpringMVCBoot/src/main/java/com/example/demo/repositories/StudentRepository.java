package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentDetails;

public interface StudentRepository extends JpaRepository<StudentDetails, Long> {
	
}
