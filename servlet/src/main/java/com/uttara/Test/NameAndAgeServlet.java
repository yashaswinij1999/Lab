package com.uttara.Test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class NameAndAgeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    public NameAndAgeServlet() {
        System.out.println("in no arg constr NameAndAgeServlet");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("in doGet NameAndAgeServlet");
		 
		 /*
		  * access user inputs
		  * input validation
		  * if succeeds print to the response
		  */
		 
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		PrintWriter pw = response.getWriter();
		
		StringBuilder sb = new StringBuilder();
		
		if(name == null || name.equals("")) {
		sb.append("<h1> PLease enter the name </h1>");	
		}
		
		if(age == null || age.equals("")) {
			sb.append("<h1> PLease enter age </h1>");
		}
		
		String msg = sb.toString();
		
		if(!msg.equals("")) {
			pw.write("<html><body><h1> Error " + msg + "</h1><br/></body></html>");
		}
		else {
			
			System.out.println("hi");
			int num = Integer.parseInt(age);
			
			if(num <= 0 || num >= 100) {
				pw.write("<html><body><h1> Invalid age </h1><br/></body></html>");
				return;
			}
			else {
				
				if(num <= 16 && num > 0 ) {
					pw.write("<html><body><h1> Welcome Child </h1><br/></body></html>");
				}
				if(num < 22 && num > 17) {
					pw.write("<html><body><h1> Welcome teen </h1><br/></body></html>");
				}
				
			}
			
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("in doPost NameAndAgeServlet");
	}

}
