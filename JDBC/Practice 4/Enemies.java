import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Enemies {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Connection con =null;
        PreparedStatement insert = null;
        PreparedStatement del = null;
        PreparedStatement select = null;
        PreparedStatement update = null;
        String sql = "";
        int ch = 0;
        String name = "";
String reason = "";
ResultSet rs = null;

        try {
            
           con = JDBCHelper.getConnection();
            sql = "insert into enemies(name,reason) values (?,?)";
           insert = con.prepareStatement(sql);

            sql = "delete from enemies";
           del = con.prepareStatement(sql);

           sql = "update enemies set reason = ? where name = ?";
           update = con.prepareStatement(sql);

           sql = "select * from enemies";
           select = con.prepareStatement(sql);

           
           while(ch != 4){

    System.out.println("enter 1 to insert");
    
    System.out.println("enter 2 to update");
    System.out.println("enter 3 to select");
    System.out.println("enter 4 to exit");
    System.out.println("enetr your choice");
    ch = sc1.nextInt();

   switch(ch){

    case  1:
    System.out.println("enter name");
    name = sc1.next();

    System.out.println("enter reason");
    reason = sc2.nextLine();

    insert.setString(1, name);
    insert.setString(2, reason);
    insert.execute();
    break;

     

    case 2:
    System.out.println("enter reason to update");
    reason = sc2.nextLine();

    System.out.println("enter name");
    name = sc1.next();

    update.setString(2, name);
    update.setString(1, reason);
    update.execute();
    break;

    case 3:
    select.execute();
    rs = select.getResultSet();

    while (rs.next()) {
       name = rs.getString("name");
       reason = rs.getString("reason");

       System.out.println("name " + name + " reason " + reason);
        
    }
    break;

    case 4:
    System.out.println("ok bye bye");

   }


       }





        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }
        finally{

            JDBCHelper.closeConnection(con);
             
              JDBCHelper.closePreparedStatement(insert);
             JDBCHelper.closePreparedStatement(select);
                JDBCHelper.closePreparedStatement(update);
                JDBCHelper.closePreparedStatement(del);


        }


        
    }
    
}
