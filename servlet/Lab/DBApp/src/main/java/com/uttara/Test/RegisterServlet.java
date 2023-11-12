package com.uttara.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con = null;
	String sql = "";
	PreparedStatement ps = null;
    
    public RegisterServlet() {
        System.out.println("no arg constr in RS");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet in RS");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doPost in RS");
		
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        
        System.out.println(" email = "+ email + " password = " + pass);
        
        StringBuilder sb = new StringBuilder();
        PrintWriter pw = response.getWriter();
        
        if(email == null || email.trim().equals("")) {
        	sb.append(" enter email ");
        }
        if(pass == null || pass.equals("")) {
        	sb.append(" enter password ");
        }
        
		String msg = sb.toString();
		System.out.println(" msg = "+ msg);
		
		if(!msg.equals("")) {
			pw.write("<html><body><h1> Oops something went wrong " + msg + "</h1><b><a href = 'Register.html'> Click here </a></body></html> ");
		}
		else {
			
			try {
				
				con = DBHelperClass.getConnection();
				sql = "insert into users(name,password)values(?,?)";
				ps = con.prepareStatement(sql);
				
				ps.setString(1, email);
				ps.setString(2, pass);
				ps.execute();
				
				pw.write("<html><body><h1> Registered Successfully email : " + email + "</h1><b><a href = 'Login.html'> Click here to login </a></body></html> ");
				
			} catch (SQLException e) {

				/* the sql exception is caught, and its SQL state is checked. the sql state "23505" is standard 
				   SQL state indicating a unique constraint violation */
				
				if(e.getSQLState().equals("23505")) {
					pw.write("<html><body><h1>email already exists</h1><b><a href = 'Register.html'>Click here to Register</a></body></html>");
				}
				else {
					e.printStackTrace();
					pw.write("<html><body><h1> error " + e.getMessage() +"</h1></body></html>");
				}

			}
			finally {
				
				DBHelperClass.close(con);
				DBHelperClass.close(ps);
				
			}
			
			
		}
	
	}

}
