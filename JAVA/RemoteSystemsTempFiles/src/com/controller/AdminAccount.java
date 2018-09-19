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

import com.db.AdminLoginDao;
import com.db.Dao;
import com.db.StudentDao;
import com.db.StudentLoginDao;
import com.model.Student;
import com.sun.glass.ui.Size;

/**
 * Servlet implementation class Account
 */
@WebServlet("/AdminAccount")
public class AdminAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminAccount() {
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
		if(request.getParameter("uname").equals(request.getParameter("mail")))
		{
			String name=request.getParameter("uname");
			String password=request.getParameter("password");
			boolean status=AdminLoginDao.validate(name,password);
			if(status)
			{
				HttpSession session = request.getSession(true); // reuse existing
				
              session.setAttribute("user", name);
                 session.setMaxInactiveInterval(30); // 30 seconds  
				RequestDispatcher rd=request.getRequestDispatcher("adminhome.html");
				rd.forward(request,response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("adminlogintrouble.html");
				rd.include(request, response);
			}
		}
		else{
		String name=request.getParameter("uname");
		String password=request.getParameter("password");
		boolean status=AdminLoginDao.validate(name,password);
		if(status)
		{
			HttpSession session = request.getSession(true); // reuse existing
			// session if exist
			// or create one
session.setAttribute("user", name);
session.setMaxInactiveInterval(30); // 30 seconds
			RequestDispatcher rd=request.getRequestDispatcher("adminhome.html");
			rd.forward(request,response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("adminlogintrouble.html");
			rd.include(request, response);
		}
		}
		
	}

}
