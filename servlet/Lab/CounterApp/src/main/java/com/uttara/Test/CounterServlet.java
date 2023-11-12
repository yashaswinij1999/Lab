package com.uttara.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int count;
	
	@Override
	public void init() throws ServletException {

		if(count == 0) {
			count = 1;
		}
		else {
			count++;
		}

	}

    
    public CounterServlet() {
        System.out.println("no arg constr of CounterServlet");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet CounterServlet");
		
		
		PrintWriter pw = response.getWriter();
		pw.write("<html><body><h1> The count is " + count + "</h1><br/></body></html>");
		destroy();
		init();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doPost CounterServlet");
	}
	
	@Override
	public void destroy() {
		
		File f = new File("C:\\Users\\yashu\\Desktop\\Yashu\\Lab\\servlet\\Lab\\counter.txt");
		System.out.println(f.isFile());
		
		BufferedWriter bw = null;
		List<String>l = new ArrayList<String>();
		l.add(" count = ");
		
		try {
			
			bw = new BufferedWriter(new FileWriter(f));
			
			bw.write(" count = " + count);
			bw.newLine();
			
			
			
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
