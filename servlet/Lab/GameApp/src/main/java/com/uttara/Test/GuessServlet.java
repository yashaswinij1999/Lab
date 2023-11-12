package com.uttara.Test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class GuessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public GuessServlet() {
        System.out.println(" in no arg constr of GuessServlet");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" in doGet of GuessServlet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(" in doPost of GuessServlet");
		
		String guessName = request.getParameter("guessname");
		PrintWriter pw = response.getWriter();
		
		String email = "";
		int noOfTries = 0;
		
		if(guessName == null || guessName.equals("")) {
			
			pw.write("<html><body><h1> Invalid name <a href = 'Guess.html'/> Click here </h1></body></html>");
			return;
			
			
		}
		else {
			
			HttpSession session = request.getSession(false);
			
			
			if(session != null && session.getAttribute("email")!= null) {
				email = (String)session.getAttribute("email");
				noOfTries = (int)session.getAttribute("no of tries");
				
				pw.write("<html><body><h1> data from request = " + guessName + " data from session email = " + email + " no of tires = " + noOfTries + "</h1><b></body></html>");
			}
			
		}
		
		
		
	}

}
