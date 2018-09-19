package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddLibrarianDao {

	public static int update(String id,String mail,String password) {
		// TODO Auto-generated method stub
		int status=0;
		String qry="update librarianregister set confirmation= ? where username= ? and email=?";
		String url="jdbc:mysql://localhost:3306/minorproject";
		String user="root";
		String password1="abhishek708";
		try{
			Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,user,password1);
			PreparedStatement stmt=con.prepareStatement(qry);
			stmt.setString(1,password);
			stmt.setString(2,id);
			stmt.setString(3,mail);
			
		    status=stmt.executeUpdate();
	       }
	     catch(ClassNotFoundException e)
	     {
		  e.printStackTrace();
	     }
		  catch(SQLException q)
		  {
			q.printStackTrace();
		  }
		
	return status;
}
}
