package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.AttendenceModel;
import com.model.Student;

public class AttendenceDao {
	static int status=0;
	public static int save(AttendenceModel s) {
		for(int i=1;i<=8;i++)
		{
		
		String query="insert into attendence values(?,?,?,?,?,?)";
		String url="jdbc:mysql://localhost:3306/minorproject";
		String user="root";
		String password="abhishek708";
		try{
			Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement stmt=con.prepareStatement(query);
		stmt.setString(1,s.getRe()+i);
		stmt.setString(1,s.getRe1);
		stmt.setString(1,s.getRe3()+i);
		stmt.setString(1,s.getRe4()+i);
		stmt.setString(1,s.getRe5()+i);
		stmt.setString(1,s.getRe6()+i);
		stmt.setString(1,s.getRe7()+i);
		stmt.setString(1,s.getRe8()+i);
		stmt.setString(1,s.getF1()+i);
		stmt.setString(1,s.getF2()+i);
		stmt.setString(1,s.getF3()+i);
		stmt.setString(1,s.getF4()+i);
		stmt.setString(1,s.getF5()+i);
		stmt.setString(1,s.getF6()+i);
		stmt.setString(1,s.getF7()+i);
		stmt.setString(1,s.getF8()+i);
		stmt.setString(1,s.getDate()+i);
		stmt.setString(1,s.getMonth()+i);
		stmt.setString(1,s.getYear()+i);
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
		
		
	
		}
		
		return status;
	}
}

