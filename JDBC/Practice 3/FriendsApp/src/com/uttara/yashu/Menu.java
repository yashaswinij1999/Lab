package com.uttara.yashu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Menu 
{

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		Connection con = null;
		PreparedStatement ps_in = null,ps_del = null,ps_up= null,ps_sel = null;
		ResultSet rs = null;
		String sql = "";
		int ch = 0;
		String fname,lname ;
		
		try 
		{
			con = Helper.getConnection();
			sql = "insert into friends(fname,lname) values(?,?)";
			ps_in= con.prepareStatement(sql);
			
			while(ch != 5) 
			{
				System.out.println("");
				System.out.println("Press 1 to insert");
				System.out.println("Press 2 to select");
				System.out.println("Press 3 to delete");
				System.out.println("Press 4 to update");
				System.out.println("Press 5 to exit");
				System.out.println("");
				
				System.out.println("enter your choice");
				ch = sc1.nextInt();
				
				switch (ch) 
				{
				case 1: 
					System.out.println("to add");
					
					
					System.out.println("Enter fname");
					fname = sc1.next();
					
					System.out.println("Enter lname");
					lname = sc1.next();
					
					System.out.println(fname + lname);
					
					ps_in.setString(1, fname);
					ps_in.setString(2, lname);
					ps_in.execute();
				    break;
				
				case 2: 
					System.out.println("to select");
					break;
		
				case 3: 		
					System.out.println("to delete");				
				    break;
				
				case 4:
					System.out.println("to update");
					break;
					
				default:
					System.out.println("invalid choice");
					break;		
					
				case 5:
					System.out.println("to exit");
					
				
				}
				
				
			}
			
		} catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			
			Helper.closeConnection(con);
			
		}
		
	}

}
