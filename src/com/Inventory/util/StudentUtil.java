package com.Inventory.util;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class StudentUtil {
	
	public static final String JNDI_LOOKUP="java:/MySql";
	public static DataSource datasource;
	
	public static DataSource getDataSource() {
		
		try {
			InitialContext context=new InitialContext();
			Object lookup=context.lookup(JNDI_LOOKUP);
			datasource=(DataSource)lookup;
			
		} catch (NamingException e) {
			
			System.out.println("Unable to find JNDI object");
			
		}
		
		return datasource;
		
	}

}
