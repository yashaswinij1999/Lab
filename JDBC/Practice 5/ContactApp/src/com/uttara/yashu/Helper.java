package com.uttara.yashu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Helper {
	
	public static Connection getConnection() 
	{
		Connection con = null;
		
		try 
		{
			Class.forName(Constants.DRIVER);
			con = DriverManager.getConnection(Constants.URL, Constants.USERID, Constants.PWD);
			System.out.println(con);
			return con;
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public static void closeConnection(Connection con)
	{
		try 
		{
			if(con != null) 
			{
				con.close();
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	public static void closeConnection(PreparedStatement ps)
	{
		try 
		{
			if(ps != null) 
			{
				ps.close();
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	public static void closeConnection(ResultSet rs)
	{
		try 
		{
			if(rs != null) 
			{
				rs.close();
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
