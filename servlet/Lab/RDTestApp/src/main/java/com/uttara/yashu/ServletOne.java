package com.uttara.yashu;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public ServletOne() {
        System.out.println("in no-arg constr S1");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet S1");
		
		request.setAttribute("reqData", "Data from request");
		
		HttpSession session = request.getSession(true);
		session.setAttribute("sessionData", "Data from session");
		
		ServletContext ctx = getServletContext();
		ctx.setAttribute("ctxData", "Data from context");
		
		RequestDispatcher rd = request.getRequestDispatcher("/two");
		rd.forward(request, response);
		System.out.println("control flow has been forwarded to S2");
		
		
		/*RequestDispatcher rd = request.getRequestDispatcher("/three");
		
		PrintWriter pw = response.getWriter();
		pw.write("<html><body><h1>Hai.....");
		rd.include(request, response);
		
		System.out.println("in S1");
		*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doPost S1");
	}

}
