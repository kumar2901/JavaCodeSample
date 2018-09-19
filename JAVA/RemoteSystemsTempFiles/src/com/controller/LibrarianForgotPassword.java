package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.AdminForgotPasswordDao;
import com.db.ForgotDao;
import com.db.LibrarianForgotPasswordDao;


/**
 * Servlet implementation class Fpassword
 */
@WebServlet("/LibrarianForgotpassword")
public class LibrarianForgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibrarianForgotPassword() {
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
		int status=LibrarianForgotPasswordDao.update(password,name);
		if(status>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("librarianpasswordchange.html");
			rd.forward(request,response);
			out.print("Success");
		}	
		}

}