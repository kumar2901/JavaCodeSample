package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

	public static boolean validate(String name, String password) {
		boolean status=false;
		   String querry="select * from Management where username=? or Email=? and password=?";
		   String url="jdbc:mysql://localhost:3306/minorproject";
			String user="root";
			String pass="abhishek708";
			try{
				Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,user,pass);
					PreparedStatement stmt=con.prepareStatement(querry);
					stmt.setString(1,name);
					stmt.setString(2,name);
					stmt.setString(3, password);
					ResultSet rs=stmt.executeQuery();
					status=rs.next();
			}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				return status;

		}
	}
			
	
	
	
