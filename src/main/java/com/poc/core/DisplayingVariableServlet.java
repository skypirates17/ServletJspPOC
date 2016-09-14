package com.poc.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poc.model.Student;

public class DisplayingVariableServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8990257896526895L;
	
	/**
	 * calls this method adds list of student to request attribute. goal is to display the list in jsp
	 */
	public void doGet(HttpServletRequest req,HttpServletResponse resp)
			throws ServletException,IOException{
		req.setAttribute("studentList", addStudents());
	    RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/jsp/students.jsp");
	    rd.forward(req, resp);
	}
	
	/**
	 * method that adds student to the list of student
	 * @return
	 */
	private List<Student> addStudents(){
		Student s1 = new Student(1,"JAY","MELON");
		Student s2 = new Student(2,"ERAINE","MELON");
		Student s3 = new Student(3,"JOHN RHEY","BANANA");
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
				
		return students;
	}

}
