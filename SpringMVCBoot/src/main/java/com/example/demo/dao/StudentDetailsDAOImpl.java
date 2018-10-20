package com.example.demo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.StudentDetails;

@Repository
public class StudentDetailsDAOImpl implements StudentDeatailsDAO{

	@Autowired
	private SessionFactory sessionFactory; 
	
	private static final Logger log = LoggerFactory.getLogger(StudentDetailsDAOImpl.class);
	
	@SuppressWarnings("unchecked")
	@Override
	public List<StudentDetails> getAllStudentDetails() {
		log.info("Controller Entered into StudentDetailsDAOImpl..");
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(StudentDetails.class);
		List<StudentDetails> list = criteria.list();
		System.out.println("List Size in StudentDetailsDAOImpl...."+list.size());
		return list;
	}

	@Override
	public boolean isStudentExist(StudentDetails studentDetails) {
		Session session = sessionFactory.openSession();
		return false;
	}

	@Override
	public void saveStudent(StudentDetails studentDetails) {
		Session session = sessionFactory.openSession();
		session.save(studentDetails);
	}

}
