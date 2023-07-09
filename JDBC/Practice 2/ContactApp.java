import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class ContactApp {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int ch = 0;
        String sql;
        PreparedStatement ps_ins = null, ps_sel = null, ps_del = null, ps_upd = null;
        Connection con = null;
        ResultSet rs = null;

        try {

            con = JDBCHelper.getConnection();
            sql = "insert into movie (name ,email) values (?,?)";
            ps_ins = con.prepareStatement(sql);

            sql = "update movie set email = ? where name = ?";
            ps_upd = con.prepareStatement(sql);

            sql = "delete from movie where name like ? ";
            ps_del = con.prepareStatement(sql);

            sql = "select * from movie";
            ps_sel = con.prepareStatement(sql);

            String name;
            String email;

            while (ch != 5) {

                System.out.println("Press 1 to insert");
                System.out.println("Press 2 to update");
                System.out.println("Press 3 to delete");
                System.out.println("Press 4 to list");
                System.out.println("Press 5 to exit");
                System.out.println("enter your choice");
                ch = sc1.nextInt();

                switch (ch) {

                    case 1: {
                        System.out.println("Enter name to insert");
                        name = sc1.next();

                        System.out.println("enter the email");
                        email = sc1.next();

                        ps_ins.setString(1, name);
                        ps_ins.setString(2, email);
                        ps_ins.execute();

                        System.out.println("");
                        System.out.println(" name : " + name + " email :" + email);
                        break;

                    }

                    case 2: {

                        System.out.println("enter the name to update");
                        name = sc1.next();

                        System.out.println("enter the email");
                        email = sc1.next();

                        ps_upd.setString(2, name);
                        ps_upd.setString(1, email);
                        ps_upd.execute();

                        break;

                    }

                    case 3: {

                        System.out.println("enter the name you want to delete");
                        name = sc1.next();
                        ps_del.setString(1, "%" + name + "%");
                        ps_del.execute();
                    }

                    case 4: {

                        ps_sel.execute();
                        rs = ps_sel.getResultSet();

                        while (rs.next()) {

                            name = rs.getString("name");
                            email = rs.getString("email");
                            System.out.println(" name: " + name + " email: " + email);

                        }

                    }

                    default: {
                        System.out.println("valid number");
                        break;
                    }

                    case 5: {
                        System.out.println("to exit");
                    }

                }

            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        } finally {

            JDBCHelper.close(ps_upd);
            JDBCHelper.close(ps_ins);
            JDBCHelper.close(ps_sel);
            JDBCHelper.close(ps_del);
            JDBCHelper.close(con);

        }

    }

}