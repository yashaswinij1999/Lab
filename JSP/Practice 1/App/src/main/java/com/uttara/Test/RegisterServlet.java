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
import java.sql.SQLException;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        System.out.println("no arg constr RS");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet Method RS");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doPost Method RS");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String rpass = request.getParameter("rpass");
		
		StringBuilder sb = new StringBuilder();
		if(name.equals("") || name == null){
			sb.append("<h3>enter name</h3>");
		}
		if(email.equals("") || email == null){
			sb.append("<h3>enter email)</h3>");
		}
		if(pass.trim().equals("") || pass == null) {
			sb.append("<h3>enter PassWord</h3>");
		}
        if(rpass.equals("") || rpass == null || !pass.equals(rpass)) {
        	sb.append("<h3>enter Repeat Password</h3>");
        }
        System.out.println("name :" + name + " email:" + email + " pass:" + pass + " rpass : "+ rpass);
		
        String msg = sb.toString();
		if(!msg.equals("")) {
			System.out.println("msg :"+ msg);
			RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
			request.setAttribute("msg", msg);
			rd.forward(request, response);
			System.out.println("forwarded to JSP");
		}
		
		else {
			
			Connection con = Helper.getConnection();
			String sql ="";
			PreparedStatement ps = null;
			PrintWriter pw = response.getWriter();
			
			try {
				
				sql = "insert into userMgt(name,email,password,rpass)values (?,?,?,?)";
				ps = con.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, email);
				ps.setString(3, pass);
				ps.setString(4, rpass);
				ps.execute();
				System.out.println(" inserted into the table");
				pw.write("<html><body><h1> Registered Successfully email : " + email + "</h1><b><a href = 'Login.jsp'> Click here to login </a></body></html> ");
				
			} catch (SQLException e) {

				if(e.getSQLState().equals("23505")) {
					pw.write("<html><body><h1>name already exists</h1><b><a href = 'Register.jsp'>Click here to Register</a><br/><a href='Login.jsp'>Click here to login </a></body></html>");
				}
				else {
					e.printStackTrace();
					pw.write("<html><body><h1> error " + e.getMessage() +"</h1></body></html>");
				}

			}
			finally {
				
				Helper.closeConnection(con);
				Helper.closePreparedStatement(ps);
				
			}
			
		}
		
		
	}

}
