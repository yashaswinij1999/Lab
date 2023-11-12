package com.uttara.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public FirstServlet() {
        System.out.println("no arg constr in firstApp");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		System.out.println("in firstservlet doGet method");
		Date dt = new Date();
		pw.write("<html><body><h1>Hello...." + dt.toString() + "</h1><b></body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in firstservlet doPost method");
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("in firstservlet init method");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("in firstservlet destroy method");
	}

}
