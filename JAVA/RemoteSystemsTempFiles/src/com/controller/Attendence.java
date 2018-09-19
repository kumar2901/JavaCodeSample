package com.controller; 
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.AdminRegisterDao;
import com.db.AttendenceDao;
import com.lit.Test;
import com.model.AttendenceModel;
import com.model.Student;

import javax.mail.Authenticator;
/**
 * Servlet implementation class Register
 */
@WebServlet("/Attendence")
public class Attendence extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Attendence() {
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
		AttendenceModel s=new AttendenceModel();
		s.setRe3(request.getParameter("date"));
		s.setRe3(request.getParameter("month"));
		s.setRe3(request.getParameter("year"));
		s.setRe1(request.getParameter("re1"));
		s.setRe2(request.getParameter("re2"));
		s.setRe4(request.getParameter("re3"));
		s.setRe5(request.getParameter("re4"));
		s.setRe6(request.getParameter("re5"));
		s.setRe7(request.getParameter("re6"));
		s.setRe8(request.getParameter("re7"));
		s.setRe8(request.getParameter("re8"));
		
		
		s.setF1(request.getParameter("f1"));
		s.setF2(request.getParameter("f2"));
		s.setF3(request.getParameter("f3"));
		s.setF4(request.getParameter("f4"));
		s.setF5(request.getParameter("f5"));
		s.setF6(request.getParameter("f6"));
		s.setF7(request.getParameter("f7"));
		s.setF8(request.getParameter("f8"));
        
		int status=AttendenceDao.save(s);
		if(status>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("adminlogin.html");
			rd.forward(request,response);
			
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("admintrouble.html");
			rd.include(request, response);
		}
	}

}
