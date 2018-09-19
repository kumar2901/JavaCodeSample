package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Library;

public class DeleteLibrarianDao { 
	
	
	public static int update(String id) {
		// TODO Auto-generated method stub
		int status=0;
		String qry="delete from librarianregister where username=?";
		String url="jdbc:mysql://localhost:3306/minorproject";
		String user="root";
		String password="abhishek708";
		try{
			Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement stmt=con.prepareStatement(qry);
			stmt.setString(1,id);
		status=stmt.executeUpdate();
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("hello");
	}
		catch(SQLException q)
		{
			q.printStackTrace();
		}
		
	return status;
}

}
