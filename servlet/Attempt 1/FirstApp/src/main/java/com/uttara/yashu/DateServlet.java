package com.uttara.yashu;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class DateServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       

	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("in init method date servlet");
	}
	
	@Override
	public void destroy() {
		System.out.println("in destroy method date servlet");
	}
	
    public DateServlet() {
       System.out.println("no arg constructor of date servlet");
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		System.out.println("in do get method");
		Date dt = new Date();
		String res = "<html><body>Today Date : " + dt.toString() + " </body></html>";
		PrintWriter pw = response.getWriter();
		pw.write(res);
		*/
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String res = "<html><body> <b> User Name: </b> " + name + " <b>age</b> : " + age + " </body></html>";
		PrintWriter pw = response.getWriter();
		pw.write(res);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
