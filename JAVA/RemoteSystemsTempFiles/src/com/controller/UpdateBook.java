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
import com.db.UpdateBookDao;


/**
 * Servlet implementation class Fpassword
 */
@WebServlet("/UpdateBook")
public class UpdateBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateBook() {
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
		String id=request.getParameter("id");
		String edition=request.getParameter("edition");
		String cost=request.getParameter("cost");
		int status=UpdateBookDao.update(id,edition,cost);
		if(status>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("updatebookmessage.html");
			rd.include(request, response);
			
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("updatebookerrormessage.html");
			rd.include(request, response);
		}
		}
		
		
	}