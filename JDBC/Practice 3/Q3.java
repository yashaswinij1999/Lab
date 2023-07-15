import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement in = null;
        PreparedStatement up = null;
        PreparedStatement sel = null;
        PreparedStatement del = null;
        String enemy = "";
        String reason = "";
        String sql = "";

        try {

            con = JDBCHelper.getConnection();

            if (con != null) {

                System.out.println("Enter the enemy");
                enemy = sc1.next();

                System.out.println("enter the reason");
                reason = sc2.nextLine();

                // sql = "insert into enemies(name,reason) values(?,?)";
                // in = con.prepareStatement(sql);
                // in.setString(1, enemy);
                // in.setString(2, reason);
                // in.execute();

                sql = "select * from enemies";
                sel = con.prepareStatement(sql);
                sel.execute();
                rs = sel.getResultSet();

                while (rs.next()) {

                    enemy = rs.getString("name");
                    reason = rs.getString("reason");
                    System.out.println("name : " + enemy + " reason: " + reason);

                }

                // sql = "delete from enemies where slno = 1";
                // del = con.prepareStatement(sql);
                // del.execute();

            } else {

                throw new IllegalArgumentException("connection Interrupted");

            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}