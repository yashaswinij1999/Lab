package com.uttara.Test;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ControllerServlet() {
        System.out.println(" in no arg constr of CS");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" in doGet of CS");
		
        request.setAttribute("reqData", "Data from Request");
		
		HttpSession s = request.getSession(true);
		s.setAttribute("sessData", "Data from Session");
		
		ServletContext ctx = request.getServletContext();
		ctx.setAttribute("ctxData", "Data from Context");
		
		RequestDispatcher rd = request.getRequestDispatcher("Forward.jsp");
		rd.forward(request, response);
		System.out.println("forwarded to JSP");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" in doPost of CS");
	}

}
