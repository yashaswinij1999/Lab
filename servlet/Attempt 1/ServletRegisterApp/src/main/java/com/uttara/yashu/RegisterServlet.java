package com.uttara.yashu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String name,email,pass;


    public RegisterServlet() {
      System.out.println("in register servlet constructor");
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in register servlet do get method");
		name = request.getParameter("name");
		email = request.getParameter("email");
		pass = request.getParameter("pass");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(pass);
		
		StringBuilder sb = new StringBuilder();
		PrintWriter pw = response.getWriter();
		
		if(name == null || name.equals("")) {
			sb.append(" name cannot be null ");
		}
		if(email == null || email.equals("")) {
			sb.append(" email cannot be null ");
		}
		if(pass == null || pass.equals("")) {
			sb.append(" password cannot be null ");
		}
		
		String error = sb.toString();
		if(!error.equals("")) {
			System.out.println(sb.toString());
			pw.write("<html><body><h1> " + sb.toString() + " </h1></body></html>");
			
		}
		else {
			
			Connection con = Helper.getConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;
			
			try {
				
				
	            String s = "select name from users where name = ?";
	            ps = con.prepareStatement(s);
	            ps.setString(1, name);
	            ps.execute();
	            rs = ps.getResultSet();
	            String findName = "";
	            
	            while(rs.next()) {
	            	findName = rs.getString("name");
	            }

                if(findName.equals(name)) {
                	pw.write("<html><body><h1>  user already exists please login or register with new name</h1></body></html>");

                }
                else {
                	
                	s = "insert into users(name,email,pass) values(?,?,?)";
                	ps = con.prepareStatement(s);
                	ps.setString(1, name);
                	ps.setString(2, email);
                	ps.setString(3, pass);
                	ps.execute();
                	pw.write("<html><body><h1> registered successfully </h1></body></html>");
                	pw.write("<html><body><a href='Login.html'>Click to login </body></html>");
                }
	            
	            
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			finally {
				
				Helper.closeConnection(con);
				Helper.closePreparedStatement(ps);
				Helper.closeResultSet(rs);
				
			}
			
			
		}
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
