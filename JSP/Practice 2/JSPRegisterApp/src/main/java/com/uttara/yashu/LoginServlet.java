package com.uttara.yashu;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        System.out.println("in login servlet constructor");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in login servlet doget method");
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		StringBuilder sb = new StringBuilder();
		String line = "";
		RequestDispatcher rd = null;
		
		if(name.equals("") || name == null) {
		  sb.append("name cannot be null ");	
		}
		if(pass == null || pass.equals("")) {
			sb.append(" password cannot be null");
		}
		
		String msg = sb.toString();
		
		if(!msg.equals("")) {
			
		    rd = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("msg", msg);
			rd.forward(request, response);
			
		}
		
		File f = new File("C:/Users/yashu/Desktop/Java/Java Labs/JSP/Practice 2/JSPRegisterApp/src/main/java/com/uttara/yashu/users.txt");
		
		if(f.isFile() && f.exists()) {
			
			BufferedReader br = null;
			
			try {
				
			    br = new BufferedReader(new FileReader(f));
			    
			   while((line  = br.readLine()) != null) {
				   
				   if(line.contains(name) && line.contains(pass)) {
					   
					   rd = request.getRequestDispatcher("Menu.jsp");
					   request.setAttribute("name",name);
					   rd.forward(request, response);
					   
				   }
				   else {
					   
					   rd = request.getRequestDispatcher("Login.jsp");
					   msg = "unable to find name and password";
					   request.setAttribute("msg", msg);
					   rd.forward(request, response);
					   
				   }
				   
			   }
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
