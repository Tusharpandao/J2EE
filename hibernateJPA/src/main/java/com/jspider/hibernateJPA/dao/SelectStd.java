package com.jspider.hibernateJPA.dao;

import com.jspider.hibernateJPA.dto.StudentDTO;

public class SelectStd  {
	
	public static void main(String[] args) {
		
		
		DataConnections connection=new DataConnections();
		
		connection.openConnection();
		connection.entityTransaction.begin();
		
		StudentDTO student = connection.entityManager.find(StudentDTO.class, 1);
		
		System.out.println(student);
		connection.entityTransaction.commit();
		connection.closeConnection();
	}

}
