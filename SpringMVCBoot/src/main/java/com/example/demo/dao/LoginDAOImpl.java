package com.example.demo.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Login;

@Repository
public class LoginDAOImpl implements LoginDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public int validateCredentials(Login login) {
	 Session session = sessionFactory.openSession();
	 String sql = "select user_name,password from login_details where user_name = ? and password = ? ";
	 Query query = session.createSQLQuery(sql);
	 query.setParameter(0, login.getUserName());
	 query.setParameter(1, login.getPassword());
	 Object[] result =  (Object[]) query.uniqueResult();
	 int count = 0;
	 if(result != null && result.length > 0) {
		 if(login.getUserName().equals(result[0]) && login.getPassword().equals(result[1])) {
			 count = 1;	 
		 }
		 else {
			 count = 2;
		 }
	 }
	 else {
		 count = 2;
	 }
	 System.out.println(count);
		return count;
	}
	
}
