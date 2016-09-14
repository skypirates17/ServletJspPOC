package com.poc.core;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayValuesServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5593038035360286802L;
	
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse resp)
			throws ServletException,IOException{
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		
		req.setAttribute("newfname", "MR."+firstname);
		req.setAttribute("newlname", "Apelyido "+lastname);
		
	    RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/jsp/displayform.jsp");
	    rd.forward(req, resp);
	}
}
