package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Library;

public class LibraryDao { 
	
	
	public static int save(Library l) {
		// TODO Auto-generated method stub
		int status=0;
		String query="insert into library values(?,?,?,?,?,?,?)";
		String url="jdbc:mysql://localhost:3306/minorproject";
		String user="root";
		String password="abhishek708";
		try{
			Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement stmt=con.prepareStatement(query);
		stmt.setString(1,l.getId());
		stmt.setString(2,l.getTitle());
		stmt.setString(3,l.getAuthor());
		stmt.setString(4,l.getPublisher());
		stmt.setString(5,l.getEdition());
		stmt.setString(6,l.getCost());
		stmt.setString(7,l.getDepart());
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
