package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.Dao;
import com.db.LibrarianLoginDao;
import com.db.StudentDao;
import com.db.StudentLoginDao;
import com.model.Student;
import com.sun.glass.ui.Size;

/**
 * Servlet implementation class Account
 */
@WebServlet("/LibrarianAccount")
public class LibrarianAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibrarianAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		    String name=request.getParameter("uname");
			String password=request.getParameter("password");
			boolean status=LibrarianLoginDao.validate(name,password);
			if(status)
			{
				HttpSession session=request.getSession();  
		        session.setAttribute("uname",name);  
				RequestDispatcher rd=request.getRequestDispatcher("librarianhome.html");
				rd.forward(request,response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("librarianfailureloginmessage.html");
				rd.include(request, response);
			}
		}
		
		}
		
	
