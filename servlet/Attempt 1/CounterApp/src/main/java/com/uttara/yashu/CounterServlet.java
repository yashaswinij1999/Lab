package com.uttara.yashu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count = 0;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("in init CounterServlet");
		
		String line = "";
		
        File f = new File("C:/Users/yashu/Desktop/Java/Java Labs/servlet/Attempt 1/CounterApp/src/main/java/com/uttara/yashu/counter.txt");
		
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new FileReader(f));
			while(( line = br.readLine())!= null) {
			
				String [] arr = line.split(" ");
				this.count = Integer.parseInt(arr[2]);
				System.out.println(count);
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			
			try {
				
				if(br != null) {
					br.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
	     }
			
	   }
		
	}		

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("in destroy CounterServlet");
		
		File f = new File("C:/Users/yashu/Desktop/Java/Java Labs/servlet/Attempt 1/CounterApp/src/main/java/com/uttara/yashu/counter.txt");
		
		BufferedWriter bw = null;
		
		try {
			
			bw = new BufferedWriter(new FileWriter(f));
			bw.write("count : " + count);
			
			
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
				e2.printStackTrace();
	     }
			
	   }		
	
	}
   
    public CounterServlet() {
        System.out.println("in no arg constructor CounterServlet");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		count++;
		String res = "<html><body>The count value is : " + count + "</body></html>";
		PrintWriter pw = response.getWriter();
		pw.write(res);	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
