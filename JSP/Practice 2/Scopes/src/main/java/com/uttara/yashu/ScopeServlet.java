package com.uttara.yashu;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class ScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ScopeServlet() {
    	System.out.println("in ScopeServlet constructor");
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("in ScopeServlet of doGet Method");
        
        request.setAttribute("reqData","data stored in request");
        
        HttpSession s = request.getSession(true);
        s.setAttribute("sessData", "data from session");
        
        ServletContext con = request.getServletContext();
        con.setAttribute("conData", "data from context");
        
        RequestDispatcher rd = request.getRequestDispatcher("Scope.jsp");
        rd.forward(request, response);
        System.out.println("forwarded to JSP");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
