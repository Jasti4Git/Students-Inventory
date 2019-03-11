package com.Inventory.DAO;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.Inventory.model.Student;

public interface StudentDAO {

	public List<Student> listAllStudents(int personID)  throws SQLException;
	
	
}
