package com.uttara.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Helper {

	 public static Connection getConnection() {
	 Connection con = null;
	
	   try {
		   
		   Class.forName(Constants.Driver);
		   con = DriverManager.getConnection(Constants.URL, Constants.USER, Constants.PA);
		   System.out.println("con : " + con);
		   return con;
		
	   } catch (Exception e) {
		   e.printStackTrace();
		   return null;
	   }
      
     
    }
	 
	public static void closePreparedStatement(PreparedStatement ps) {
		
		try {
			if(ps != null) {
				ps.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
    
	public static void closeResultSet(ResultSet rs) {
		
		try {
			if(rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void closeConnection(Connection con) {
		
		try {
			if(con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
