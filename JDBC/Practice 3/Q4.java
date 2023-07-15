import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Q4 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int ch = 0;
        Connection con = null;
        PreparedStatement insert = null;
        PreparedStatement update = null;
        PreparedStatement select = null;
        PreparedStatement delete = null;
        ResultSet rs = null;
        String firstName = "";
        String lastName = "";
        String sql = "";

        try {

            con = JDBCHelper.getConnection();

            while (ch != 5) {

                System.out.println("");
                System.out.println("Press 1 to enter names");
                System.out.println("Press 2 to delete a name");
                System.out.println("Press 3 to update a name");
                System.out.println("Press 4 to display the names");
                System.out.println("Press 5 to exit");
                System.out.println("");
                System.out.println("enter your choice");
                String name = "";
                ch = sc1.nextInt();

                switch (ch) {

                    case 1:
                        System.out.println("Enter first name of your friend");
                        firstName = sc1.next();

                        System.out.println("enter the last name");
                        lastName = sc1.next();

                        sql = "insert into friends(fname,lname)values(?,?)";
                        insert = con.prepareStatement(sql);

                        insert.setString(1, firstName);
                        insert.setString(2, lastName);
                        insert.execute();

                        break;

                    case 2:
                        System.out.println("to delete");
                        System.out.println("enter the name you want to delete");
                        name = sc1.next();

                        sql = "delete from friends where fname = ?";
                        delete = con.prepareStatement(sql);
                        delete.setString(1, name);
                        delete.execute();
                        break;

                    case 3:
                        System.out.println("to update");

                        System.out.println("the name needs to be edited");
                        lastName = sc1.next();

                        System.out.println("enter the first name");
                        firstName = sc1.next();

                        sql = "update friends set lname = ? where fname = ?";
                        update = con.prepareStatement(sql);
                        update.setString(1, lastName);
                        update.setString(2, firstName);

                        update.execute();
                        break;

                    case 4:
                        System.out.println("to dislay");
                        sql = "select * from friends";
                        select = con.prepareStatement(sql);
                        select.execute();

                        rs = select.getResultSet();
                        while (rs.next()) {

                            firstName = rs.getString("fname");
                            lastName = rs.getString("lname");
                            System.out.println("firstName : " + firstName + " lastName : " + lastName);

                        }
                        break;

                    default:
                        System.out.println("invalid");
                        break;

                    case 5:
                        System.out.println("to exit");

                }

            }

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            JDBCHelper.close(con);
            JDBCHelper.close(rs);
            JDBCHelper.close(delete);
            JDBCHelper.close(select);
            JDBCHelper.close(update);
            JDBCHelper.close(insert);

        }

    }

}
