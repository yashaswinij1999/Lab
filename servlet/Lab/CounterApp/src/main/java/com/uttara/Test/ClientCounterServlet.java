package com.uttara.Test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ClientCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int count;

    
    public ClientCounterServlet() {
        System.out.println("in no arg constr of Client Counter Servlet");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet Client Counter Servlet");
		
		PrintWriter pw = response.getWriter();
        HttpSession session = request.getSession(false);
       
        if(session == null) {
        	
        	session = request.getSession(true);
        	count = 1;
        	session.setAttribute("count", count);
        	pw.write("<html><body><h1>Count = " + count + "</h1><b></body></html>");
        	
        }
        else {
        	
        	int count = (int)session.getAttribute("count");
        	count ++;
        	session.setAttribute("count", count);
        	pw.write("<html><body><h1>Count = " + count + "</h1><b></body></html>");
        	
        }
        
       
	   
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doPost Client Counter Servlet");
	}

}
