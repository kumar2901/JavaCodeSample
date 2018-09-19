package com.controller; 
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.FacultyRegisterDao;
import com.lit.Test;
import com.model.Student;

import javax.mail.Authenticator;
/**
 * Servlet implementation class Register
 */
@WebServlet("/FacultyRegister")
public class FacultyRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyRegister() {
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
		Student s=new Student();
		String p=request.getParameter("password");
		String m=request.getParameter("mail");
		//Test.send(p,m);
		s.setFname(request.getParameter("fname"));
		s.setLname(request.getParameter("lname"));
		s.setEmail(request.getParameter("mail"));
		s.setUname(request.getParameter("uname"));
		s.setPassword(request.getParameter("password"));
		s.setSex(request.getParameter("sex"));
		s.setCpassword(request.getParameter("cpassword"));
		s.setDepart(request.getParameter("depart"));
        
		int status=FacultyRegisterDao.save(s);
		if(status>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("message.html");
			rd.forward(request,response);
			
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("facultytrouble.html");
			rd.include(request, response);
		}
		}
		
	}


