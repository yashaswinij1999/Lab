package com.uttara.yashu;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterServlet() {
        super();
        System.out.println("in register servlet constructor");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("in register servlet doget Method");
		 
		 String name = request.getParameter("name");
		 String email = request.getParameter("email");
		 String pass = request.getParameter("pass");
		 String rpass = request.getParameter("rpass");
		 
		 StringBuilder sb = new StringBuilder();
		 
		 if(name == null || name.equals("")) {
			 sb.append(" name cannot be null ");
		 }
		 if(email == null || email.equals("")) {
			 sb.append(" email cannot be null ");
		 }
		 if(pass == null || pass.equals("")) {
			 sb.append(" pass cannot be null ");
		 }if(rpass == null || rpass.equals("")) {
			 sb.append(" repeat password cannot be null ");
		 }
		 if(!pass.equals(rpass)) {
			 sb.append(" password and repeat password should be same ");
		 }
		 
		 String msg = sb.toString();
		 
		 System.out.println("msg " + msg);
		 
		 if(!msg.equals("")) {
			 
			request.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
			rd.forward(request, response);
			System.out.println("forwrding request to Register jsp");
			 
		 }
		 
		 File f = new File("C:/Users/yashu/Desktop/Java/Java Labs/JSP/Practice 2/JSPRegisterApp/src/main/java/com/uttara/yashu/users.txt");
		 
		 if(f.isFile() && f.exists()) {
			 
			 BufferedWriter bw = null;
			 
			 try {
				 
				 String text = "name : " + name + " email : "+ email + " password : " + pass + " repeat password : " + rpass;
				 bw = new BufferedWriter(new FileWriter(f));
				 bw.write(text);
				 bw.newLine();
				 
				 RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
				 rd.forward(request, response);
				 
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			finally {
				
				try {
					
					if(bw != null) {
						bw.close();
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				
			}
			 
		 }
		 
		 
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
