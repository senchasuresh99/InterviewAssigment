package com.suresh1;

import java.sql.*;

public class Updateapp {
	public static void main(String args[])
	{
		String id = "1";
		String pwd = "suresh@1234";
		String newPwd = "suresh@123";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "login1", "root");
			Statement stmt = con.createStatement();
		
			// Updating database
			String q1 = "UPDATE userid set pwd = '" + newPwd +
					"' WHERE id = '" +id+ "' AND pwd = '" + pwd + "'";
			int x = stmt.executeUpdate(q1);
			
			if (x > 0)		
				System.out.println("Password Successfully Updated");		
			else		
				System.out.println("ERROR OCCURRED :(");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
