package com.uttara.yashu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class DateServlet
 */
public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DateServlet() {
        // TODO Auto-generated constructor stub
    	System.out.println("in dateservlet");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in ds");
		Date dt = new Date();
		String [] quotes = {"Today is a Good Day","Everyday is new Learning","Stay Healthy and Stay safe","Aham Brahmsami"};
		String html = "<html><body><h1>Date and Time</h1><b> Today Date and Time is " + dt.toString()+ "</b><br/>" +" Quote of the day : " +  quotes[(int)(Math.random()* quotes.length)] + "</body></html> ";
		System.out.println("html = " + html);
		PrintWriter pt = response.getWriter();
		pt.write(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
