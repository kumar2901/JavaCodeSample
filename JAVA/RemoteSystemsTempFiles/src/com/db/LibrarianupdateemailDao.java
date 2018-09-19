package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibrarianupdateemailDao {

	public static int update(String oldemail,String newemail) {
		// TODO Auto-generated method stub
		int status=0;
		String qry="update facultyregister set email= ? where email= ?";
		String url="jdbc:mysql://localhost:3306/minorproject";
		String user="root";
		String pass="abhishek708";
		try{
			Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement stmt=con.prepareStatement(qry);
			stmt.setString(1,newemail);
			stmt.setString(2,oldemail);
			
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

