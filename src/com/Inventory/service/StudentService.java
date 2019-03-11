package com.Inventory.service;

import java.sql.SQLException;
import java.util.List;

import com.Inventory.model.Student;

public interface StudentService {
	
	public List<Student> getStudents(int personID) throws SQLException;

}
