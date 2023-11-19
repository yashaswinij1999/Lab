package com.uttara.yashu;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public ServletTwo() {
       System.out.println("in no arg constr S2");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("in doGet S2");	
	
	HttpSession session  = request.getSession(false);
	ServletContext ctx = getServletContext();
	
	String reqData = "";
	String sessData = "";
	String contextData = "";
	
	if(request.getAttribute("reqData") != null) {
		reqData = (String) request.getAttribute("reqData");
	}
	if(session != null && session.getAttribute("sessionData") != null) {
		sessData = (String)session.getAttribute("sessionData");
	}
	if(ctx.getAttribute("ctxData") != null) {
		contextData = (String)ctx.getAttribute("ctxData");
	}
	
	PrintWriter pw  = response.getWriter();
	pw.write("<html><body><h1> requestData "+ reqData + " sessionData  = " + sessData + " contextData " + contextData + " </h1><b></body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doPost S2");	
	}

}
