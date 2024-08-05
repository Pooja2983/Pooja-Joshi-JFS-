package edu.students.controller;

import java.util.*;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.students.dao.StudentDao;
import edu.students.model.Student;

@WebServlet("/")
public class StudentServlet extends HttpServlet{

	private static final long serialVersionUID=1L;
	private StudentDao studentDao = new StudentDao();

	public StudentServlet()
	{
		super();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String pass = request.getParameter("pass");

		Student student = new Student();
		student.setEmail(email);
		student.setFname(fname);
		student.setLname(lname);
		student.setMobile(mobile);
		student.setPass(pass);
		
		String servURL = request.getServletPath();
		
		switch(servURL)
		{
		
		case "/studs" :
		{
			try {
				List<Student> studList = studentDao.getStudent();
				request.setAttribute("studList",studList);
				RequestDispatcher dispatcher = request.getRequestDispatcher("stud-list.jsp");
				dispatcher.forward(request, response);
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
				response.sendRedirect("error.jsp");
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		break;
		}
		case "/delete" :
		{
			try {
				int id = Integer.parseInt(request.getParameter("id"));
				int r= 0;
				r= studentDao.deleteStudentById(id);
				if(r>0)
				{
					response.sendRedirect("done.jsp");
				}
				else {
					response.sendRedirect("error.jsp");
				}
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
				response.sendRedirect("error.jsp");
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		break;
		}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String pass = request.getParameter("pass");

		Student student = new Student();
		student.setEmail(email);
		student.setFname(fname);
		student.setLname(lname);
		student.setMobile(mobile);
		student.setPass(pass);

		String requestPart = request.getServletPath();
		
		switch(requestPart)
		{
		case "/addStudent" :
		{
			try {
				int x = 0;
				x = studentDao.saveStudent(student);
				if(x>0)
				{
					response.sendRedirect("done.jsp");
				}
				else {
					response.sendRedirect("error.jsp");
				}
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
				response.sendRedirect("error.jsp");
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		break;
		}
		case "/updateStudent" :
		{
			try {
				int x = 0;
				x = studentDao.updateStudent(student);
				if(x>0)
				{
					response.sendRedirect("done.jsp");
				}
				else {
					response.sendRedirect("error.jsp");
				}
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
				response.sendRedirect("error.jsp");
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		break;
		}
		case "/delete" :
		{

			try {
				int id = Integer.parseInt(request.getParameter("id"));
				int x = 0;
				x = studentDao.deleteStudentById(id);
				if(x>0)
				{
					response.sendRedirect("done.jsp");
				}
				else {
					response.sendRedirect("error.jsp");
				}
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
				response.sendRedirect("error.jsp");
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		break;
		}
		}
		
		
	}
}
