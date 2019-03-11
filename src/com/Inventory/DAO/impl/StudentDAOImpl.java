package com.Inventory.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.Inventory.DAO.StudentDAO;
import com.Inventory.model.Student;
import com.Inventory.util.StudentUtil;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public List<Student> listAllStudents(int ID) throws SQLException {
		List<Student> studentList=new ArrayList();
		
		DataSource datasource=StudentUtil.getDataSource();
		Connection connect=datasource.getConnection();
		
		PreparedStatement ps=connect.prepareStatement("select * from persons where PersonID=?");  
		ps.setInt(1,ID);  


		
		ResultSet results=ps.executeQuery();
		Student s;

		while(results.next())
		{
			s=new Student();
			s.setPersonId(results.getInt("PersonID"));
			s.setLastname(results.getString("lastname"));
			s.setFirstname(results.getString("firstname"));
			s.setAddress(results.getString("Address"));
			s.setCity(results.getString("city"));

			studentList.add(s);
		}
		
		
		return studentList;
		
	}
	
	
	


	

}
