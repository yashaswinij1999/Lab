package com.uttara.yashu;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
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
		String name, email ,dob, crdDate,type ,phoneNo="";
		int slno = 0;
		
		
		
		try 
		{
			con = Helper.getConnection();			
			
			while(ch != 5) 
			{
				
				con.setAutoCommit(false);
				System.out.println("");
				System.out.println("Press 1 to insert");
				System.out.println("Press 2 to delete");
				System.out.println("Press 3 to select");
				System.out.println("Press 4 to update");
				System.out.println("Press 5 to exit");
				System.out.println("");
				
				System.out.println("Enter your choice");
				ch = sc1.nextInt();
				
				switch (ch) {
				case 1:
					System.out.println("to add");
					

					sql = "insert into contacts insert(name,email,DOB,createdDate) values(?,?,?,?)";
					
					System.out.println("Enter name");
					name = sc1.next();
					
					System.out.println("Enter email");
					email = sc1.next();
					
					System.out.println("enter Date of Birth in yyyy-MM-dd");
					dob = sc2.nextLine();
					Date dt = Date.valueOf(dob);
				
					System.out.println("Enter created date");
				    crdDate = sc2.nextLine();
				    Date crd = Date.valueOf(crdDate);
					
					ps_in= con.prepareStatement(sql,java.sql.Statement.RETURN_GENERATED_KEYS);
					ps_in.setString(1, name);
					ps_in.setString(2, email);
					ps_in.setDate(3, dt);
					ps_in.setDate(4, crd);
					ps_in.execute();
					System.out.println("name :" + name + " email :" + email + " dob :" + dt + " crdDate :" + crd);
					
					rs = ps_in.getGeneratedKeys();
					rs.next();
					slno = rs.getInt("slno");
					System.out.println("slno :" + slno);
					
					while(ch != 2) 
					{
						System.out.println("");
						System.out.println("Press 1 to add ");
						System.out.println("Press 2 to exit");
						System.out.println("");
						System.out.println("Enter your choice");
						ch = sc1.nextInt();
						
						switch (ch) 
						{
						case 1: 
							System.out.println("enter slno");
							slno = sc1.nextInt();
							
							System.out.println("enter phone numbers");
							phoneNo = sc2.nextLine();
							
							System.out.println("enter type");
							type = sc2.nextLine();
							
							sql = "insert into contacts_phno(contacts_slno,phoneNo,type) values (?,?,?)";
							ps_in = con.prepareStatement(sql);
							
							ps_in.setInt(1, slno);
							ps_in.setString(2, phoneNo);
							ps_in.setString(3, type);
							ps_in.execute();
							break;
									
						default:
							System.out.println("invalid choice");
							break;
					    
						case 2 :
							System.out.println("go back");
						}

						
					}
					con.commit();
					System.out.println("inserted to contacts table");
					break;
					
				case 2:
					System.out.println("to delete");
					System.out.println("enter name which you to delete");
					name = sc1.next();
					
					try 
					{
						Helper.deleteDataFromContactsInfo(con, name);
						Helper.deleteFromContacts(con, name);
						System.out.println("deleted successfully");
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}			
					break;
					
				case 3:
					System.out.println("to select");
					sql = "select *  from contacts";
					ps_sel = con.prepareStatement(sql);
					ps_sel.execute();
					
					rs = ps_sel.getResultSet();
					while(rs.next()) 
					{
						name = rs.getString("name");
						email = rs.getString("email");
						dt = rs.getDate("dob");
						crd = rs.getDate("createdDate");
						System.out.println("name : " + name + " email : " + email + " dt : " + dt + " crd : " + crd);
						
					}
					
					while(ch != 2) 
					{
						System.out.println("");
						System.out.println("Press 1 to select data form contacts_PhoneNo ");
						System.out.println("Press 2 to exit");
						System.out.println("");
						System.out.println("enter your choice");
						ch = sc1.nextInt();
						
						switch (ch) 
						{
						case 1:
							sql = "select * from contacts_phno";
							ps_sel = con.prepareStatement(sql);
							ps_sel.execute();
							rs = ps_sel.getResultSet();
							
							while(rs.next()) 
							{
								slno = rs.getInt("contacts_slno");
								phoneNo = rs.getString("phoneNo");
								type = rs.getString("type");
								System.out.println("slno : " + slno + " phoneNo : " + phoneNo +  " type : " + type);
								
							}
							break;
							
						default:
							System.out.println("invalid choice");
							break;
							
						case 2:
							System.out.println("go back");
							
						}
					
					}
					break;		
					
				case 4:
					System.out.println("to update");
					System.out.println("enter new email which you want to set");
					email = sc1.next();
					
					System.out.println("enter name ");
					name = sc1.next();
					
					sql = "update contacts set email = ? where name = ?";
					ps_up = con.prepareStatement(sql);
					ps_up.setString(1, email);
					ps_up.setString(2, name);
					ps_up.execute();
					break;
					
				default:
					System.out.println("invalid value");
					
				case 5:
					System.out.println("Bye Bye");
					break;		
				
				}
				
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}	
		finally 
		{
			Helper.closeConnection(con);
			Helper.closePreparedStatement(ps_up);
			Helper.closePreparedStatement(ps_in);
			Helper.closePreparedStatement(ps_sel);
			Helper.closePreparedStatement(ps_del);
			Helper.closeResultSet(rs);
		}

	}

}
