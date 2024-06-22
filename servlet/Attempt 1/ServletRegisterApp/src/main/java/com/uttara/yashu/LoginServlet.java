package com.uttara.yashu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String name,email,pass;
	
    public LoginServlet() {
        System.out.println("in login servlet no arg constructor");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in login servlet do get method");

		name = request.getParameter("name");
		pass = request.getParameter("pass");
		
		System.out.println(name);
		System.out.println(pass);
		
		StringBuilder sb = new StringBuilder();
		PrintWriter pw = response.getWriter();
		
		if(name == null || name.equals("")) {
			sb.append(" name cannot be null ");
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
				
				
	            String s = "select * from users where name = ?";
	            ps = con.prepareStatement(s);
	            ps.setString(1, name);
	            ps.execute();
	            rs = ps.getResultSet();
	            String findName = "";
	            String lpass = "";
	            
	            while(rs.next()) {
	            	name = rs.getString("name");
	            	pass = rs.getString("pass");
	            	System.out.println(findName);
	            	System.out.println(lpass);
	            }

	            System.out.println(findName.equals(name) && lpass.equals(pass));
	            
                if(name.equals(name) && pass.equals(pass) ) {
                	HttpSession sess = request.getSession(true);
                	sess.setAttribute("name", name);
                	pw.write("<html><body><h1> Success  </h1></body></html>");
                	pw.write("<html><body><a href='ChangePassword.html'>Click to change password </body></html>");
                	pw.write("<html><body><a href='logout'>Click to Logout </body></html>");
                }
                else {
                	pw.write("<html><body><h1> user not found, please register</h1></body></html>");
                	pw.write("<html><body><a href='Register.html'>Click here to Register </body></html>");
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
