package com.uttara.yashu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	public static void closePreparedStatement(PreparedStatement ps)
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
	public static void closeResultSet(ResultSet rs)
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
	public static void deleteDataFromContactsInfo(Connection con,String name)throws SQLException
	{
		String sql = "delete from contacts_phno where contacts_slno = (select slno from contacts where name = ?) ";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.execute();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new SQLException();
		}
		
	}
	public static void deleteFromContacts(Connection con, String name) throws SQLException
	{
	    String sql = "DELETE FROM CONTACTS WHERE name = ?";
	    try (PreparedStatement pstmt = con.prepareStatement(sql)) 
	    {
	        pstmt.setString(1, name);
	        pstmt.executeUpdate();
	    }
	    catch(Exception e) 
	    {
	    	e.printStackTrace();
	    	throw new SQLException();
	    }
	}
	

}

