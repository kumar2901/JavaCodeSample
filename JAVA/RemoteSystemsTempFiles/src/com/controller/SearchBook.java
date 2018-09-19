package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.Dao;
import com.db.StudentDao;
import com.db.StudentLoginDao;
import com.model.Student;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.sun.glass.ui.Size;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/SearchBook")
public class SearchBook extends HttpServlet{ 
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchBook() {
        super();
        // TODO Auto-generated constructor stub
    }

 public void doPost(HttpServletRequest request, 
  HttpServletResponse response)
  throws ServletException,IOException{
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  Statement st;
	String url="jdbc:mysql://localhost:3306/minorproject";
	String user="root";
	String pass="abhishek708";
	try{
		Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection conn=DriverManager.getConnection(url,user,pass);
  System.out.println("Connected to the database");
  String  emp_dept  = request.getParameter("depart");

  ArrayList al=null;
  ArrayList emp_list =new ArrayList();
  String query = 
		  "select * from library where department='"+emp_dept+"'";
  System.out.println("query " + query);
  st = (Statement) conn.createStatement();
  ResultSet  rs = st.executeQuery(query);


  while(rs.next()){
  al  = new ArrayList();
  
  al.add(rs.getString(1));
  al.add(rs.getString(2));
  al.add(rs.getString(3));
  al.add(rs.getString(4));
  al.add(rs.getString(5));
  al.add(rs.getString(6));
  al.add(rs.getString(7));
  System.out.println("al :: "+al);
  emp_list.add(al);
  }

  request.setAttribute("empList",emp_list);
  
 System.out.println("empList " + emp_list);

  // out.println("emp_list " + emp_list);

  String nextJSP = "/searchbook.jsp";
  RequestDispatcher dispatcher = 
   getServletContext().getRequestDispatcher(nextJSP);
  dispatcher.forward(request,response);
  conn.close();
  System.out.println("Disconnected from database");
  } catch (Exception e) {
  e.printStackTrace();
  }
  }
}