package com.uttara.yashu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public LogoutServlet() {
        System.out.println("in logout servlet constructor");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in logout servlet do get method");
		PrintWriter pw = response.getWriter();
		String name = "";
		
		HttpSession s = request.getSession(false);
		
		if(s != null) {
			
			 name = (String) s.getAttribute("name");
			 String sql = "";
			 PreparedStatement ps = null;
			 Connection con = null;
			 
			 try {
				 
				 con = Helper.getConnection();
				 sql = "delete from users where name = ?";
				 ps = con.prepareStatement(sql);
				 ps.setString(1, name);
				 ps.execute();
				 s.removeAttribute("name");
				 s.invalidate();
				 pw.write("<html><body><h1> logged sucessfully </h1></body></html>");
				 pw.write("<html><body><a href='Home.html'>Click here to HomePage </body></html>");
				 
				
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
