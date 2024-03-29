package com.jspider.hibernateJPA.dao;

import com.jspider.hibernateJPA.dto.StudentDTO;

public class DeleteStd {
	
	public static void main(String[] args) {
		

		DataConnections connection=new DataConnections();
		
		connection.openConnection();
		connection.entityTransaction.begin();
		
		StudentDTO student = connection.entityManager.find(StudentDTO.class, 1);
		if (student != null) {
			System.out.println(student);
			
			connection.entityManager.remove(student);
		}
		
		System.out.println(student);
		connection.entityTransaction.commit();
		connection.closeConnection();
	}

}
