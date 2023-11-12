package com.uttara.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.catalina.connector.Response;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    String email,pass,sql;
    PreparedStatement ps = null;
    Connection con = null;
    ResultSet rs = null;
   
	
    public LogoutServlet() {
        System.out.println("in arg constr logOutServlet");
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet logOutServlet");
		
		HttpSession session = request.getSession(false);
		PrintWriter pw = response.getWriter();
		
		if(session != null) {
			
			email = (String)session.getAttribute("email");
			pass = (String)session.getAttribute("password");
			
			System.out.println("email = " + email + " password = " + pass);
			
			try {
				
				con = DBHelperClass.getConnection();
				sql = "delete from users where name = ? and password = ?";
				ps = con.prepareStatement(sql);
				
				ps.setString(1, email);
				ps.setString(2, pass);
				
				int rowAffected = ps.executeUpdate();
				
				if(rowAffected > 0) {
					
					session.removeAttribute("email");
					session.removeAttribute("password");
					session.invalidate();
					
					pw.write("<html><body><h1> logged out succesfully </h1> <b></body></html>");
					
				}
				else {
					pw.write("<html><body><h1> logout failed </h1> <b></body></html>");
				 
			   }
				
				
			} catch (Exception e) {
				// TODO: handle exception
			    e.printStackTrace();
		   }
			
		
		}
		else {
			
			pw.write("<html><body><h1> session not created </h1><b><a href = 'HomePage.html'>click here to register/login</a></body></html>");
			
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doPost logOutServlet");
	}

}
