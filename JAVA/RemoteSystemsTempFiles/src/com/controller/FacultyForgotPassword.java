package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.FacultyForgotPasswordDao;
import com.db.ForgotDao;


/**
 * Servlet implementation class Fpassword
 */
@WebServlet("/FacultyForgotpassword")
public class FacultyForgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyForgotPassword() {
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
		String password=request.getParameter("npassword");
		int status=FacultyForgotPasswordDao.update(password,name);
		if(status>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("facultypasswordchange.html");
			rd.forward(request,response);
			out.print("Success");
		}	
		}

}
