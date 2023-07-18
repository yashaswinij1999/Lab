
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ContactsApp {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int ch = 0;
        String sql = "";
        String email = "";
        String name = "";
        String ph_No;
        String dob = "";
        String crdDate;
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement insert = null, update = null, delete = null, select = null;
        PreparedStatement ph_insert = null, ph_select = null;

        try {

            con = JDBCHelper.getConnection();
            con.setAutoCommit(false);

            while (ch != 5) {

                System.out.println("");
                System.out.println("Press 1 to add");
                System.out.println("Press 2 to delete");
                System.out.println("Press 3 to update");
                System.out.println("Press 4 to select");
                System.out.println("Press 5 to Exit");
                System.out.println("");
                System.out.println("Enter your choice");
                ch = sc1.nextInt();

                switch (ch) {

                    case 1:
                        sql = "insert into contactsApp(name,email,dob,crtdate)values (?,?,?,?)";

                        System.out.println("enter name");
                        name = sc1.next();

                        System.out.println("enter email");
                        email = sc2.nextLine();

                        System.out.println("enter dob");
                        dob = sc1.next();
                        SimpleDateFormat sc = new SimpleDateFormat("dd/MM/yyyy");
                        java.util.Date dt = sc.parse(dob);
                        java.sql.Date date = new java.sql.Date(dt.getTime());

                        System.out.println("enter created date");
                        crdDate = sc1.next();
                        SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
                        java.util.Date dt1 = sfd.parse(crdDate);
                        java.sql.Date date1 = new java.sql.Date(dt1.getTime());

                        insert = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                        insert.setString(1, name);
                        insert.setString(2, email);
                        insert.setDate(3, date);
                        insert.setDate(4, date1);
                        insert.execute();

                        rs = insert.getGeneratedKeys();
                        rs.next();
                        int slno = rs.getInt("slno");
                        System.out.println("slno = " + slno);

                        while (ch != 2) {

                            System.out.println("Press 1 to add");
                            System.out.println("Press 2 to exit");
                            System.out.println("");
                            System.out.println("Enter your choice");
                            ch = sc1.nextInt();

                            int no = 0;
                            String type = "";
                            String phNo = "";

                            switch (ch) {

                                case 1:
                                    sql = "insert into Contact_PhoneInfo(contact_slno,phone,type)values(?,?,?)";
                                    System.out.println("add slno");
                                    no = sc1.nextInt();

                                    System.out.println("add phno");
                                    phNo = sc1.next();

                                    System.out.println("add type");
                                    type = sc1.next();

                                    ph_insert = con.prepareStatement(sql);
                                    ph_insert.setInt(1, no);
                                    ph_insert.setString(2, phNo);
                                    ph_insert.setString(3, type);
                                    ph_insert.execute();

                                    break;

                                case 2:
                                    System.out.println("ok bye ");
                                    break;

                            }

                        }
                        con.commit();
                        break;

                    case 2:
                        System.out.println("to delete");
                        break;

                    case 3:
                        System.out.println("update");
                        break;

                    case 4:
                        System.out.println("to select");
                        break;

                    default:
                        System.out.println("Invalid break");
                        break;

                    case 5:
                        System.out.println("ok bye bye");

                }

            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}