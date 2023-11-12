package com.uttara.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBHelperClass {
	
	public static Connection getConnection() {
		
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		
		try {
			
			Class.forName(DBConstants.DRIVER);
			con = DriverManager.getConnection(DBConstants.URL, DBConstants.USERID, DBConstants.PSD);
			System.out.println("con = " + con);
			return con;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static void close(PreparedStatement st) {
		
		try {
			
			if(st != null) {
				st.close();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
    public static void close(ResultSet rs) {
		
		try {
			
			if(rs != null) {
				rs.close();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
    
    public static void close(Connection con) {
		
		try {
			
			if(con != null) {
				con.close();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}

