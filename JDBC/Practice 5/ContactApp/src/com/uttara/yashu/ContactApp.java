package com.uttara.yashu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ContactApp 
{

	public static void main(String[] args) 
	{
		Connection con = null;
		PreparedStatement ps_in = null,ps_del = null,ps_sel = null,ps_up = null;
		ResultSet rs = null;
		String sql = "";
		int ch = 0;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		
		try 
		{
			con = Helper.getConnection();
			
			
			while(ch != 5) 
			{
				
				System.out.println("");
				System.out.println("Press 1 to insert");
				System.out.println("Press 2 to select");
				System.out.println("Press 3 to delete");
				System.out.println("Press 4 to update");
				System.out.println("Press 5 to exit");
				System.out.println("");
				
				System.out.println("Enter your choice");
				ch = sc1.nextInt();
				
				switch (ch) {
				case 1:
					System.out.println("to add");
					break;
					
				case 2:
					System.out.println("to select");
					break;
					
				case 3:
					System.out.println("to update");
					break;		
					
				case 4:
					System.out.println("to delete");
					break;
					
				default:
					System.out.println("invalid value");
					
				case 5:
					System.out.println("to ");
					break;		
				
				}
				
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}		

	}

}
