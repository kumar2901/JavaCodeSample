package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.AdminDao;
import com.db.Dao;

/**
 * Servlet implementation class Administrator
 */
@WebServlet("/Administrator")
public class Administrator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Administrator() {
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
			boolean status=Dao.validate(name,password);
			if(status)
			{
				RequestDispatcher rd=request.getRequestDispatcher("Admin.html");
				rd.forward(request,response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("Administrator.html");
				rd.include(request, response);
				out.print("<font color='red' Size='100px'><h1>Login-Fail</h1></font>");
			}
		}
		else{
		String name=request.getParameter("uname");
		String password=request.getParameter("password");
		boolean status=AdminDao.validate(name,password);
		if(status)
		{
			RequestDispatcher rd=request.getRequestDispatcher("Admin.html");
			rd.forward(request,response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("Administrator.html");
			rd.include(request, response);
			out.print("<font color='red' Size='100px'><h1>Login-Fail</h1></font>");
		}
		}
		
	}

}
