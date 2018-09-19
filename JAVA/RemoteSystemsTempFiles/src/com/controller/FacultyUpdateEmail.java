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
import com.db.FacultyupdateemailDao;
import com.db.ForgotDao;
import com.db.StudentupdateemailDao;
import com.db.StudentupdatenumberDao;


/**
 * Servlet implementation class Fpassword
 */
@WebServlet("/FacultyUpdateEmailnumber")
public class FacultyUpdateEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyUpdateEmail() {
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
		String oldemail=request.getParameter("oldemail");
		String newemail=request.getParameter("newemail");
		int status=FacultyupdateemailDao.update(oldemail,newemail);
		if(status>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("facultyupdateemailnumbermessage.html");
			rd.forward(request,response);
			out.print("Success");
		}	
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("facultyupdatemailerrormessage.html");
					rd.include(request, response);
		}
		}

}
