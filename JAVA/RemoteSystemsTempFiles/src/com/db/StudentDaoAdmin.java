package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Admin;

public class StudentDaoAdmin {

	public static int save(Admin s) {
		// TODO Auto-generated method stub
		int status=0;
		String query="insert into admin values(?,?,?,?,?,?)";
		String url="jdbc:mysql://localhost:3306/minorproject";
		String user="root";
		String password="abhishek708";
		try{
			Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement stmt=con.prepareStatement(query);
		stmt.setString(1,s.getFname());
		stmt.setString(2,s.getLname());
		stmt.setString(3,s.getId());
		stmt.setString(4,s.getEmail());
		stmt.setString(5,s.getPassword());
		stmt.setString(6,s.getCpassword());
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

