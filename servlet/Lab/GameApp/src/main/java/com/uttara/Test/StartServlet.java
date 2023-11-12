package com.uttara.Test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class StartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int noOfTires = 1;
	
	
    public StartServlet() {
        System.out.println("in start no arg const");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("in start doGet Method");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in start doPost Method");
		
		/* 
		access the inputs from request
		validate
		using bw store email id, no of tries
		forward the CF to Guess.html	
		*/
		
		
		PrintWriter pw = response.getWriter();
		
		String email = request.getParameter("email");
		
		StringBuilder sb = new StringBuilder();
		
		
		if(email == null || email.trim().equals("")) {
			sb.append("Please enter the email");
		}
		
		String msg = sb.toString();
		
		if(!msg.equals("")) {
			pw.write("<html><body><h1> Oops something went wrong " + msg + "<a href = 'HomePage.html'/> click here to try again</h1><b></body></html>");
			return;
			
		}
		else {
			
			HttpSession session = request.getSession(true);
			if(session.getAttribute("no of tries")== null) {
				
				session.setAttribute("email", email);
				session.setAttribute("no of tries", noOfTires);
				
			}
			else {
				
				noOfTires++;
				session.setAttribute("no of tries", noOfTires);
			}
			
			
		}
		pw.write("<html><body><h1>email = " + email + " and no of tries = " + noOfTires + "</h1><b></body></html>");
		
		RequestDispatcher rd = request.getRequestDispatcher("Guess.html");
		rd.forward(request, response);
		System.out.println(" forwarded to Guess.html ");
		
	}

}
