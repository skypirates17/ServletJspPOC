package com.poc.core;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

	    RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/hello.jsp");
	    rd.forward(request, response);
    }
    
    /**
     * calls the get method when action is post to prevent code duplication
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException{
    	this.doGet(request,response);
    }

}
