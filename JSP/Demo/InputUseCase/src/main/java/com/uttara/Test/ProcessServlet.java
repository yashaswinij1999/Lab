package com.uttara.Test;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class ProcessServlet
 */
public class ProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessServlet() {
        super();
       System.out.println("in no arg constructor of process servlet ");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doGet Method of Process servlet ");
		
		request.setAttribute("data", "Data in request");
		request.setAttribute("IntData", 100);
		
		HttpSession s = request.getSession(true);
		s.setAttribute("data", "Data in session");
		
		RegBean rb= new RegBean();
		rb.setEmail("gomu@gmail.com");
		rb.setUname("ramu");
		rb.setPass("ram");
		
		s.setAttribute("bean", rb);
		
		ServletContext ctx = request.getServletContext();
		ctx.setAttribute("data", "data in context");
		
		RequestDispatcher rd = request.getRequestDispatcher("OutPut.jsp");
		rd.forward(request, response);
		System.out.println("forwarded Control flow  to OutPut.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doPost Method of Process servlet ");
	}

}
