package com.uttara.Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.Context;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public ServletTwo() {
        System.out.println("in arg constr S2");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("in doGet S2");
		 
		 HttpSession session = request.getSession(false);
		 ServletContext sc = getServletContext();
		 
		 String reqData = "";
		 String sessData = "";
		 String conData = "";
		 
		 if(request.getAttribute("reData") != null) {
			 reqData =(String)request.getAttribute("reData");
		 }
		 if(session != null && session.getAttribute("sessData") != null) {
			 sessData = (String)session.getAttribute("sessData");
		 }
		 if(sc.getAttribute("conData")!= null) {
			 conData = (String)sc.getAttribute("conData");
		 }
		 
		 PrintWriter pw = response.getWriter();
		 pw.write("<html><body><h1> reqData = " + reqData + " session Data = " + sessData + " ContextData = " + conData + "</h1><b></body></html>");
			System.out.println("recieved the request from S1");	 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("in doPost S2");
		 
		
	}

}
