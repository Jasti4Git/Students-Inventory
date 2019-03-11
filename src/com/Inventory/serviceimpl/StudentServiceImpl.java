package com.Inventory.serviceimpl;

import java.sql.SQLException;
import java.util.List;

import com.Inventory.DAO.impl.StudentDAOImpl;
import com.Inventory.model.Student;
import com.Inventory.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Override
	public List<Student> getStudents(int personID) throws SQLException {
		
		return new StudentDAOImpl().listAllStudents(personID);
		
		
	}

	
	
	
}
