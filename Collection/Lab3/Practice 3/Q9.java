import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Q9 {

    public static void main(String[] args) {

        int ch = 0;

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String name, dob, email, id;
        Student st = new Student();
        Date dt = null;
        TreeSet<Student> ts = new TreeSet<>();
        List<Student> l = new ArrayList<>();
        boolean valid = true;

        while (ch != 5) {

            System.out.println("");
            System.out.println("Press 1 to add Students");
            System.out.println("Press 2 to get Student info based on id");
            System.out.println("Press 3 to sort students based on date of birth");
            System.out.println("Press 4 to list the students");
            System.out.println("Press 5 to exit");
            System.out.println("");
            System.out.println("Enter the choice");
            ch = sc2.nextInt();

            switch (ch) {

                case 1:

                    try {

                        System.out.println("to add");
                        System.out.println("");

                        System.out.println("to add Student name");
                        name = sc1.next();

                        System.out.println("");
                        System.out.println("to add dob");
                        dob = sc1.next();

                        if (UtilMethods.validateDate(dob)) {

                            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                            dt = sdf.parse(dob);

                        } else {

                            System.out.println("InValid Date Reference");
                            break;

                        }

                        System.out.println("");
                        System.out.println("to add email");
                        email = sc1.next();

                        System.out.println("");
                        System.out.println("to add id");
                        id = sc1.next();

                        if (UtilMethods.checkIfDateIsINFuture(dt)) {

                            st = new Student(name, dt, email, id);
                            ts.add(st);
                            l.add(st);
                            st.addStudents(st);

                        } else {

                            System.out.println("");
                            System.out.println("inCorrect Date Format");
                            break;

                        }

                    } catch (Exception e) {

                        // TODO: handle exception
                        e.printStackTrace();

                    }

                    break;

                case 2:

                    System.out.println("to get ");
                    System.out.println("");

                    System.out.println("enter the student id");
                    id = sc1.next();

                    st.getInfo(id);

                    break;

                case 3:

                    System.out.println("to sort");
                    System.out.println("");

                    String s = st.sortStudentBasedOnDateOfBirth();
                    System.out.println(s);
                    System.out.println(ts);
                    break;

                case 4:
                    System.out.println("to list");
                    System.out.println(l);
                    break;

                default:
                    System.out.println("in valid");
                    break;

                case 5:
                    System.out.println("to exit");

            }

        }

    }

}
