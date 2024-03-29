package com.jspider.hibernateJPA.dao;

import com.jspider.hibernateJPA.dto.StudentDTO;

public class CreateStd {
	
	
	
	public static void main(String[] args) {
		
		DataConnections connection=new DataConnections();
		
		StudentDTO student=new StudentDTO();
		student.setId(10);
		student.setName("mrunali");
		student.setEmail("mrunali@gmail.com");
		student.setMobile(1234533890l);
		student.setAge(23);
		connection.openConnection();
		connection.entityTransaction.begin();
		
		connection.entityManager.persist(student);
		
		
		connection.entityTransaction.commit();
		connection.closeConnection();
	}
	

}
