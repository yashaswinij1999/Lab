import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCHelper {

    public static void close(Connection con) {

        try {

            if (con != null) {
                con.close();
            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }
    }

    public static void close(ResultSet rs) {

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

    public static void close(PreparedStatement ps) {

        try {

            if (ps != null) {
                ps.close();
            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

    public static Connection getConnection() {

        Connection con = null;

        try {

            Class c1 = Class.forName(Contants.DRIVER);
            con = DriverManager.getConnection(Contants.URL, Contants.USERID, Contants.PA);
            return con;

        } catch (SQLException | ClassNotFoundException e) {

            // TODO: handle exception
            e.printStackTrace();
            return null;

        }

    }

}
