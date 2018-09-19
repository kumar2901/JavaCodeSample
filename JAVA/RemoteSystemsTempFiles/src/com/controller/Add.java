package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.LibraryDao;
import com.db.StudentDao;
import com.model.Library;
import com.model.Student;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
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
		Library l=new Library();
		l.setId(request.getParameter("id"));
		l.setTitle(request.getParameter("title"));
		l.setAuthor(request.getParameter("author"));
		l.setPublisher(request.getParameter("publisher"));
		l.setEdition(request.getParameter("edition"));
		l.setCost(request.getParameter("cost"));
		l.setDepart(request.getParameter("depart"));
         
		int status=LibraryDao.save(l);
		if(status>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("librarymessagesuccess.html");
			rd.include(request, response);
			
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("librarybookadderror.html");
			rd.include(request, response);
			out.print("Fail to add book");
		}
		}
		
		
	}
