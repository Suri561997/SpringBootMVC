package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class StudentDetails {
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "student_age")
	private Integer studentAge;
	
	@Column(name = "student_college_name")
	private String studentCollegeName;
	
	@Id
	@Column(name = "student_id")
	private Integer studentID;
	
	@Column(name = "student_academic_year")
	private String studentAcademicYear;
	
	@Column(name = "student_address")
	private String studentAddress;
	
	@Column(name = "student_department")
	private String studentDepartment;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentCollegeName() {
		return studentCollegeName;
	}

	public void setStudentCollegeName(String studentCollegeName) {
		this.studentCollegeName = studentCollegeName;
	}

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	public String getStudentAcademicYear() {
		return studentAcademicYear;
	}

	public void setStudentAcademicYear(String studentAcademicYear) {
		this.studentAcademicYear = studentAcademicYear;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentDepartment() {
		return studentDepartment;
	}

	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}
	
}
