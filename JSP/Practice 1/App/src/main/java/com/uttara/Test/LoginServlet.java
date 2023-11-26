package com.uttara.Test;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
       System.out.println("in no arg constr LS");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doGet Method LS");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doPost Method LS");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		StringBuilder sb = new StringBuilder();
		if(name.equals("") || name == null){
			sb.append("<h3>enter name</h3>");
		}
		if(email.equals("") || email == null){
			sb.append("<h3>enter email)</h3>");
		}
		
		String msg = sb.toString();
		if(!msg.equals("")) {
			System.out.println("msg :"+ msg);
			pw.write("<html><body><h1>Error " + msg + "</h1> <a href = 'Register.jsp'> Click here to Register </a><br/> <a href = 'Login.jsp'>Click here to login again</a></body></html>");
		}
		else {
			
			Connection con = Helper.getConnection();
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql = "";
			
			try {
				
				sql = "select * from userMgt where name = ? and email = ? ";
				ps = con.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, email);
				
				rs = ps.executeQuery();
				
				while(rs.next()){
					
					 name = rs.getString("name");
					 email = rs.getString("email");
					System.out.println("name : " + name + " email : " + email);
					
					RequestDispatcher rd = request.getRequestDispatcher("Menu.jsp");
					request.setAttribute("name", name);
					
					rd.forward(request, response);
					 
				}
				
				pw.write("<html><body><h1>SomeThing went Wrong " + msg + "</h1> <a href = 'Register.jsp'> Click here to Register </a><br/> <a href = 'Login.jsp'>Click here to login again</a></body></html>");
				
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

}
