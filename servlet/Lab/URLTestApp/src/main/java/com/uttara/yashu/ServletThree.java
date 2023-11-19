package com.uttara.yashu;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class ServletThree
 */
public class ServletThree extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletThree() {
        // TODO Auto-generated constructor stub
    	System.out.println("in S3 no arg constr");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in S3 do get");
		PrintWriter pw = response.getWriter();
		pw.write("<html><body><h1>in S3 do get</h1></body><html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in S3 do post");
	}

}
