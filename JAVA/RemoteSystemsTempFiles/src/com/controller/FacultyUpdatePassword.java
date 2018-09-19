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
import com.db.FacultyupdatepasswordDao;
import com.db.ForgotDao;
import com.db.StudentupdatenumberDao;
import com.db.StudentupdatepasswordDao;


/**
 * Servlet implementation class Fpassword
 */
@WebServlet("/FacultyUpdatePassword")
public class FacultyUpdatePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyUpdatePassword() {
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
		String oldnumber=request.getParameter("oldpass");
		String newnumber=request.getParameter("newpass");
		int status=FacultyupdatepasswordDao.update(oldnumber,newnumber);
		if(status>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("facultyupdatepasswordmessage.html");
			rd.forward(request,response);
			out.print("Success");
		}	
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("facultyupdatepassworderrormessage.html");
			rd.include(request,response);
			out.print("failure");	
		}
		}

}
