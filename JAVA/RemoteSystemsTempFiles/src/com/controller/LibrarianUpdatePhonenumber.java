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
import com.db.FacultyupdatenumberDao;
import com.db.ForgotDao;
import com.db.LibrarianupdatenumberDao;
import com.db.StudentupdatenumberDao;


/**
 * Servlet implementation class Fpassword
 */
@WebServlet("/LibrarianUpdatePhonenumber")
public class LibrarianUpdatePhonenumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibrarianUpdatePhonenumber() {
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
		String oldnumber=request.getParameter("oldmobile");
		String newnumber=request.getParameter("newmobile");
		int status=LibrarianupdatenumberDao.update(oldnumber,newnumber);
		if(status>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("librarianupdatemobilenumbermessage.html");
			rd.forward(request,response);
			out.print("Success");
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("librarianupdatemobilenumbererrormessage.html");
			rd.forward(request,response);
			out.print("failure");
		}	
		}

}