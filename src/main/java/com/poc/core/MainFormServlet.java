package com.poc.core;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainFormServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7457553192089421563L;
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp)
			throws ServletException,IOException{
	    RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/jsp/mainform.jsp");
	    rd.forward(req, resp);
	}

}
