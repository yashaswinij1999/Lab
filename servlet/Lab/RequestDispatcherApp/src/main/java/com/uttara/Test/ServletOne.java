package com.uttara.Test;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public ServletOne() {
       System.out.println("in cong constr S1");
    }
    
    private void inti() {
		// TODO Auto-generated method stub
    	

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doGet constr S1");
		
		request.setAttribute("reData", "Data from request");
		
		HttpSession session = request.getSession(true);
		session.setAttribute("sessData", "Data from Session");
		
		ServletContext sc = getServletContext();
		sc.setAttribute("conData", "Data from Context");
		
		RequestDispatcher rd = request.getRequestDispatcher("/two");
		rd.forward(request, response);
		System.out.println("forwarded to S1");
		
		/*
		
		to access data stored in init parameter in web.xml
	    ServletConfig con = getServletConfig();
    	String data = con.getInitParameter("initName");
    	System.out.println("data in init = " + data); 
    	
    	String contextData = sc.getInitParameter("contextName");
		System.out.println(contextData);
    	
    	 */
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doPost constr S1");
	}

}
