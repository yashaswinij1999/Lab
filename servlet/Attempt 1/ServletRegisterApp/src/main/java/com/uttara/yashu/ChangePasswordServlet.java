package com.uttara.yashu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class ChangePasswordServlet
 */
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String pass;
	String npass;
	String rpass;
	String name;

    public ChangePasswordServlet() {
      System.out.println("in change password servlet");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("in changepassword servlet do get  method");
		 pass = request.getParameter("pass");
		 npass = request.getParameter("npass");
		 rpass = request.getParameter("rpass");
		 
		 System.out.println(pass);
		 System.out.println(npass);
		 System.out.println(rpass);
		 
		 StringBuilder sb = new StringBuilder();
		 PrintWriter pw = response.getWriter();
		 
		 if(pass == null || pass.equals("")) {
			 sb.append(" <html><body><h1>old password cannot be empty</h1></body></html> ");
		 }
		 if(npass == null || npass.equals("")) {
			 sb.append(" <html><body><h1>new password cannot be empty</h1></body></html> ");
		 }if(rpass == null || rpass.equals("")) {
			 sb.append(" <html><body><h1>repeat password cannot be empty</h1></body></html> ");
		 }
		 if(!npass.equals(rpass)) {
			 sb.append("<html><body><h1>newpass and repeat password should be similar</h1></body></html>");
		 }
		 
		 String msg = sb.toString();
		 
		 if(!msg.equals("")) {
			 pw.write(msg);
		 }
		 else {
			 
			 System.out.println(pass);
			 System.out.println(npass);
			 System.out.println(rpass);
			 
			 HttpSession s = request.getSession(false);
			
			 
			 if(s != null) {
				 
				 name = (String) s.getAttribute("name");
				 String sql = "";
				 PreparedStatement ps = null;
				 Connection con = null;
				 
				 try {
					 
					 con = Helper.getConnection();
					 sql = "update users set pass = ?  where name = ?";
					 ps = con.prepareStatement(sql);
					 ps.setString(1, npass);
					 ps.setString(2, name);
					 ps.execute();
					 pw.write("<html><body><h1> changed the password sucessfully </h1></body></html>");
					 
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				 finally {
					Helper.closeConnection(con);
					Helper.closePreparedStatement(ps);
				}
				 
			 }
			 
		 }
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
