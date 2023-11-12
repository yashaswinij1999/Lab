import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hsqldb.result.Result;

public class Test {

    public static void main(String[] args) {

        String driver = "org.hsqldb.jdbc.JDBCDriver";
        String userId = "SA";
        String Url = "jdbc:hsqldb:hsql://localhost/";
        String PA = "";
        Connection con = null;
        Result set = null;
        PreparedStatement st;
        String sql = "";
        String name = "";

        try {

            Class c1 = Class.forName(driver);
            con = DriverManager.getConnection(Url, userId, PA);
            st = null;

            sql = "insert into name(fname,Iname) values ('ram','charan')";
            st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                name = rs.getString(1);

            }

        } catch (ClassNotFoundException |

                SQLException e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}