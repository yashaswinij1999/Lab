package com.uttara.yashu;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class DateServlet
 */
public class DateServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	String [] quotes = {"To be or not to be is the question","Today is good day","You measure person not based on results but how he sits, walks and talks"};

   
    public DateServlet() {
        System.out.println("in date servlet no arg constructor");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in date servlet ");
		int index = (int) (Math.random()*quotes.length);
		Date d = new Date();
		String html = "<html><body> <b>Today Date and Time :</b> " + d.toString() +  " <br/> <b> quote </b> : " + quotes[index] + "</body></html>";
		PrintWriter pw = response.getWriter();
		pw.write(html);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
