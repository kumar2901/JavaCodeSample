package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.AddFacultyDao;
import com.db.AddStudentDao;
import com.db.FacultyForgotPasswordDao;
import com.db.ForgotDao;
import com.lit.Test;
import javax.mail.Authenticator;


/**
 * Servlet implementation class Fpassword
 */
@WebServlet("/AddFaculty")
public class AddFaculty extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFaculty() {
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
		String p=request.getParameter("pass");
		String m=request.getParameter("mail");
		Test.send(p,m);
		String id=request.getParameter("id");
		String mail=request.getParameter("mail");
		String password=request.getParameter("pass");
		int status=AddFacultyDao.update(id,mail,password);
		if(status>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("addmessage.html");
			rd.forward(request,response);
			out.print("Success");
		}	
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("addmessagefailurefaculty.html");
			rd.forward(request,response);
		}
		}

}
