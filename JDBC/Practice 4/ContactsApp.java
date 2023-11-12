import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ContactsApp {

    public static void main(String[] args) {

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement insert1  = null;
        PreparedStatement update = null;
        PreparedStatement delete = null;
        PreparedStatement display = null;
        PreparedStatement insert2 = null;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int ch = 0;
        String name,email,type,sql,dob,crtdt,phonenumber;
        int no = 0;


        try {

            con = JDBCHelper.getConnection();

            while (ch != 5) {
                
                     System.out.println("Press 1 to insert");
                     System.out.println("Press 2 to update");
                     System.out.println("Press 3 to display");
                     System.out.println("Press 4 to delete");
                     System.out.println("Press 5 to exit");
                     System.out.println("enter your choice");
                     ch = sc1.nextInt();

                     switch (ch) {
                         case 1:

                         con.setAutoCommit(false);
                         sql = "insert into contacts(name,email,dob,crtdt)values(?,?,?,?)";
                         insert1 = con.prepareStatement(sql,java.sql.Statement.RETURN_GENERATED_KEYS);

                         System.out.println("enter the name");
                         name = sc1.next();

                         System.out.println("enter email");
                         email = sc2.nextLine();

                         System.out.println("enter dob");
                         dob = sc1.next();
                         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                         Date dt = sdf.parse(dob);
                         java.sql.Date date = new java.sql.Date(dt.getTime());

                         System.out.println("enter crtdt");
                         crtdt = sc1.next();
                         SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
                         Date dt2 = sdf.parse(crtdt);
                         java.sql.Date date2 = new java.sql.Date(dt2.getTime());

                         insert1.setString(1, name);
                         insert1.setString(2, email);
                         insert1.setDate(3, date);
                         insert1.setDate(4, date2);
                         insert1.execute();

                         rs = insert1.getGeneratedKeys();
                         rs.next();
                         int serial = rs.getInt("slno");
                         System.out.println(serial);

                         while (ch != 3) {

                            System.out.println("to insert");
                            System.out.println("to exit");
                            System.out.println("enter choice");
                            ch = sc1.nextInt();

                            switch (ch) {
                                case 1:

                                sql = "insert into contact_phoneinfo(contacts_slno,phonenumber,type) values(?,?,?)";
                                insert2 = con.prepareStatement(sql);

                                System.out.println("enter serial no");
                                no = sc1.nextInt();

                                System.out.println("enter phonenumber");
                                phonenumber = sc2.nextLine();

                                System.out.println("enter type");
                                type = sc2.nextLine();

                                insert2.setInt(1, no);
                                insert2.setString(2, phonenumber);
                                insert2.setString(3, type);
                                insert2.execute();

                                con.commit(); 
                                    
                                    break;
                                
                                    case 3:
                                    System.out.println("to exit");
                                    
                            }
                            
                         }
                             
                             break;


                             case 2:

                             sql = "update contacts set dob = ? where name = ?";
                             update =con.prepareStatement(sql);

                             System.out.println("enter name which you want to update");
                             name = sc1.next();

                            //  System.out.println("enter email");
                            //  email = sc2.nextLine();

                             System.out.println("enter dob");
                             dob = sc1.next();

                             SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
                             Date dt3 = sdf3.parse(dob);
                             java.sql.Date date3 = new java.sql.Date(dt3.getTime());

                             update.setDate(1, date3);
                             update.setString(2, name);
                             update.execute();
                             break;

                             case 3:
                             
                             sql = "select * from contacts";
                             display = con.prepareStatement(sql);

                             display.execute();

                             rs = display.getResultSet();

                             while (rs.next()) {

                                name = rs.getString("name");
                                email = rs.getString("email");
                             
                               System.out.println(name + " "+ email);


                                
                             }
                             break;

                             case 4:
                             sql = "delete from contacts where name = ?";
                             delete = con.prepareStatement(sql);


                             System.out.println("enter the name which you want to delete");
                             name = sc1.next();

                             delete.setString(1, name);
                             delete.execute();
                             break;



                         default:
                             throw new AssertionError();
                     }



            }

            
        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            JDBCHelper.closeConnection(con);
            JDBCHelper.closeResultset(rs);
            JDBCHelper.closePreparedStatement(display);
            JDBCHelper.closePreparedStatement(delete);
            JDBCHelper.closePreparedStatement(insert1);
            JDBCHelper.closePreparedStatement(update);
            

        }
        
    }
    
}
