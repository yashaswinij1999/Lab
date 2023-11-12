package com.uttara.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ChangePassWordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String sql = "";
	Connection con = null;
	PreparedStatement ps = null;
	

    public ChangePassWordServlet() {
        System.out.println("in no arg constr in Change Password Servlet");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("in doGet Change Password Servlet");
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("in doPost Change Password Servlet");
		 
		 StringBuilder sb = new StringBuilder();
		 PrintWriter pw  = response.getWriter();
         String oldpass = request.getParameter("oldpass");
         String newpass = request.getParameter("newpass");
         String repass = request.getParameter("repass");
         
         

         if(oldpass == null || oldpass.trim().equals("")) {
	        sb.append(" enter old password");
         }
         if(newpass == null || newpass.trim().equals("")) {
 	        sb.append(" enter new password");
          }
         if(repass == null || repass.trim().equals("")) {
 	        sb.append(" enter reconfirm password");
          }
         if(!newpass.equals(repass)) {
        	 sb.append(" password are not matching ");
         }

         String msg = sb.toString();
         
         if(!msg.equals("")) {
        	 pw.write("<html><body><h1> Oops something went wrong " + msg + "</h1><b><a href = 'changePassword.html'> Click here to login </a></body></html> ");
         }
         else {
        	 
        	 sql = "update users set password = ? where name = ?";
        	 
        	 con = DBHelperClass.getConnection();
        	 HttpSession session = request.getSession(false);
        	 String email = (String)session.getAttribute("email");
        	 
        	 System.out.println("email ="+ email);
        	 
        	 try {
        		 
        		 ps = con.prepareStatement(sql);
        		 ps.setString(1, newpass);
        		 ps.setString(2, email);
        		 ps.execute();
        		 
        		 pw.write("<html><body><h1> password as been changes suceesfully<h1><b></body></html>");
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
        	finally {
        		
        		DBHelperClass.close(con);
        		DBHelperClass.close(ps);
        	
				
			}
         
        	 
        }
   
	
	}

}
