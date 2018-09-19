package com.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
@WebServlet("/Notice")
public class Notice extends HttpServlet{  
	public Notice() {
        super();
	}
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException   
 {        
String eid=req.getParameter("notice");                           
Statement stmt=null;        
PrintWriter out=res.getWriter(); 
String url="jdbc:mysql://localhost:3306/minorproject";
String user="root";
String password="abhishek708";
try       
{              
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,user,password);
stmt=con.createStatement();              
int i = stmt.executeUpdate("insert into notice values('"+eid+"')");              
if(i>0)                
out.println("Inserted Successfully");              
else                
out.println("Insert Unsuccessful");        
}        
catch(Exception e)        
{          out.println(e);               
 }    
}}