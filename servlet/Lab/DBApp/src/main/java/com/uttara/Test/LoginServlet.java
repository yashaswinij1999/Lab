package com.uttara.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection con = null;
	PreparedStatement select = null;
	String email,pass, sql;
	ResultSet rs = null;
	

   
    public LoginServlet() {
        System.out.println("in no arg constr LS");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doGet constr LS");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doPost constr LS");
		
		PrintWriter pw = response.getWriter();
		StringBuilder sb = new StringBuilder();
		
		email = request.getParameter("email");
		pass = request.getParameter("pass");
		
		System.out.println("email = " + email + " pass = " + pass);
		
		if(email == null || email.trim().equals("")) {
			sb.append(" enter email ");
		}
		if(pass == null || pass.trim().equals("")) {
			sb.append(" enter password ");
		}
		
		String msg = sb.toString();
		
		if(!msg.equals("")) {
			pw.write("<html><body><h1> Oops something went wrong " + msg + "</h1><b><a href = 'Login.html'> Click here to login </a></body></html> ");
		}
		else {
			
			try {
				
				con = DBHelperClass.getConnection();
				System.out.println("con = " + con);
				
				/* here we are checking whether the email id exists or not*/
				sql = " select * from users where name = ? and password = ?";
				select = con.prepareStatement(sql);
				select.setString(1, email);
				select.setString(2, pass);
				
				/* if exists we are retrieving from db*/
				rs = select.executeQuery();
				
				if(rs.next()) {
					
					email = rs.getString("name");
					pass = rs.getString("password");
					
					System.out.println("email = " + email + " password = " + pass);
					
					HttpSession session = request.getSession();
					session.setAttribute("email", email);
					session.setAttribute("password", pass);
					pw.write("<html><body><h1> Hi " + email + " login successful </h1><b><br/><a href = 'logout'>Click here to logout</a><br/><br/><a href = 'changePassword.html'>Click here to change password</a></body></html>");
					
				}
				else {
					
					System.out.println("login failed");
					pw.write("<html><body><h1> login failed </h1><b><a href = 'HomePage.html'>click here to register/login</a></body></html>");
					
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
		}
	
	}

}
