package com.jspider.hibernateJPA.dao;


import com.jspider.hibernateJPA.dto.StudentDTO;

public class StudentDAO {
	
	
	public static void main(String[] args) {
		
		DataConnections connection=new DataConnections();
		
		StudentDTO student=new StudentDTO();
		student.setName("tusharr");
		student.setEmail("tushar@gmail.com");
		student.setMobile(1234567890l);
		student.setAge(23);
		connection.openConnection();
		connection.entityTransaction.begin();
		
		connection.entityManager.persist(student);
		
		
		connection.entityTransaction.commit();
		connection.closeConnection();
	}
	

}
