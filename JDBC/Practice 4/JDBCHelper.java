import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCHelper {

    public static Connection getConnection(){

        Connection con = null;

        try {

           Class.forName(JDBCContants.DRIVER);
            con = DriverManager.getConnection(JDBCContants.URL, JDBCContants.USERID, JDBCContants.PA);
            System.out.println(con);
            return  con;

            
        } catch (Throwable t) {
            // TODO: handle exception
            t.printStackTrace();
            return  null;
        }
    }

    public static void closePreparedStatement(PreparedStatement st){


        try {

            if(st != null){
                st.close();
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

     public static  void closeConnection(Connection con){


        try {

            if(con != null){
                con.close();
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
    

     public static void closeResultset(ResultSet rs){


        try {

            if(rs != null){
                rs.close();
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
    
    
}


