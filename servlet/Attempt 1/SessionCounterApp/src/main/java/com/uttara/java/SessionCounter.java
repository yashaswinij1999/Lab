package com.uttara.java;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class SessionCounter extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	

    public SessionCounter() {
        System.out.println("in session counter");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in do getMethod");
		
		HttpSession s = request.getSession(true);
		Integer count = (Integer)(s.getAttribute("count"));	
		
		if(count == null) {
			count = 0;
		}
			
		count++;
		s.setAttribute("count", count);

        PrintWriter pw = response.getWriter();
		pw.write("the count : " + count);	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
