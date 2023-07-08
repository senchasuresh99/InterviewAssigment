package com.suresh1;

import java.sql.*;

public class Insertapp {
	public static void main(String args[])
	{
		String id = "1";
		String pwd = "suresh@1234";
		String fullname = "Suresh Sencha";
		String email = "suresh99@gmail.com";
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "login1", "root");
			Statement stmt = con.createStatement();
			
			// Inserting data in database
			String q1 = "insert into userid values('" +id+ "', '" +pwd+"', '" +fullname+ "', '" +email+ "')";
			int x = stmt.executeUpdate(q1);
			if (x > 0)		
				System.out.println("Successfully Inserted");		
			else		
				System.out.println("Insert Failed");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}