package com.uttara.yashu;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ServletThree extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public ServletThree() {
        System.out.println("in no arg constr S3");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doGet in S3");
		
		PrintWriter pw = response.getWriter();
		pw.write("Hello....Welcome<b></h1></body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doPost in S3");
	}

}
