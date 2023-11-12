import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class MovieMenuApp {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int choice = 0;
        String name;
        String reason;
        int rating;

        Connection con = null;
        PreparedStatement ps_insert = null, ps_select = null, ps_del = null, ps_update = null;
        ResultSet rs = null;
        String sql = null;

        try {

            con = JDBCHelper.getConnection();
            sql = "insert into movie(name,reason) values (?,?)";
            ps_insert = con.prepareStatement(sql);

            sql = "update movie set reason = ? where name = ?";
            ps_update = con.prepareStatement(sql);

            sql = "delete from movie where name like ?";
            ps_del = con.prepareStatement(sql);

            sql = "select * from movie";
            ps_select = con.prepareStatement(sql);

            while (choice != 5) {

                System.out.println("Press 1 to insert");
                System.out.println("Press 2 to update");
                System.out.println("Press 3 to delete");
                System.out.println("Press 4 to list");
                System.out.println("Press 5 to exit");
                System.out.println("enter your choice");
                choice = sc1.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Enter name of the movie");
                        name = sc1.next();

                        System.out.println(" Enter reason for the movie " + name);
                        reason = sc1.next();

                        ps_insert.setString(1, name);
                        ps_insert.setString(2, reason);

                        ps_insert.execute();

                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    case 5:
                        break;

                    default:
                        break;

                }

            }

        } catch (SQLException e) {

            // TODO: handle exception
            e.printStackTrace();

        } finally {

            JDBCHelper.close(con);
            JDBCHelper.close(rs);
            JDBCHelper.close(ps_insert);
            JDBCHelper.close(ps_del);
            JDBCHelper.close(ps_select);
            JDBCHelper.close(ps_update);

        }

    }

}
