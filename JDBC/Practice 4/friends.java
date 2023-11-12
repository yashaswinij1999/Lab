import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class friends {

    public static void main(String[] args) {
        
        Connection con =  null;
        PreparedStatement insert = null;
        PreparedStatement update = null;
        PreparedStatement delete = null;
        PreparedStatement display = null;
        ResultSet rs = null;
        String sql = "";
        Scanner sc1 = new Scanner(System.in);
        String Fname = "";
        String Iname = "";
        int ch = 0;

        try {

            con = JDBCHelper.getConnection();
            sql =" insert into friends(Fname,Iname) values(?,?)";
            insert = con.prepareStatement(sql);

            sql = "update friends set Iname = ? where Fname = ?";
            update = con.prepareStatement(sql);

            sql = "select * from friends";
            display = con.prepareStatement(sql);

            sql = "delete from friends  where Fname like ?";
            delete = con.prepareStatement(sql);

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
                        System.out.println("enter first name");
                        Fname = sc1.next();

                        System.out.println("enter second name");
                        Iname = sc1.next();

                        insert.setString(1, Fname);
                        insert.setString(2, Iname);
                        insert.execute();
                        break;

                        case 2:
                        System.out.println("enter the name which you want to update");
                        Fname = sc1.next();

                        System.out.println("enter the iname");
                        Iname = sc1.next();

                        update.setString(2, Fname);
                        update.setString(1, Iname);
                        update.execute();
                        break;

                        case 3:
                        display.execute();
                        rs = display.getResultSet();

                        while (rs.next()) {

                            Fname = rs.getString("Fname");
                            Iname = rs.getString("Iname");

                            System.out.println(Fname + " " + Iname);
                            
                        }
                        break;

                        case 4:
                        System.out.println("enter the name which you want to delete");
                        String name = sc1.next();

                        delete.setString(1, "%" + name + "%");
                        delete.execute();
                        break;

                    default:
                        throw new AssertionError();
                }
                
            }
            


            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        finally{

            JDBCHelper.closeConnection(con);
            JDBCHelper.closeResultset(rs);
            JDBCHelper.closePreparedStatement(display);
            JDBCHelper.closePreparedStatement(insert);
            JDBCHelper.closePreparedStatement(delete);
            JDBCHelper.closePreparedStatement(update);


        }

    }
    
}
