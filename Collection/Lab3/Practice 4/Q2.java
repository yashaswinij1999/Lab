
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Q2 {

    public static void main(String[] args) {

        /* 
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int ch = 0;
        String name = "";
        LinkedHashSet l = new LinkedHashSet<>();
        TreeSet st = new TreeSet<>();
        Iterator it = null;

        while (ch < 7) {

            System.out.println(" ");
            System.out.println("Press 1 Add  name");
            System.out.println("Press 2 List  name");
            System.out.println("Press 3 Remove  name");
            System.out.println("Press 4 Search Friend name");
            System.out.println("Press 5 Sort based on alphabetical order");
            System.out.println("Press 6 Sort based on lengthwise");
            System.out.println("Press 7 to exit");
            System.out.println(" ");

            System.out.println("Enter your choice");
            ch = sc1.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Name");
                    name = sc1.next();
                    l.add(name);
                    System.out.println("names added sucessfully");
                    break;

                case 2:
                    it = l.iterator();
                    while (it.hasNext()) {
                        Object elem = it.next();
                        System.out.println(elem);

                    }
                    break;
                case 3:
                    System.out.println("Enter name you want to remove ");
                    name = sc1.next();

                    it = l.iterator();
                    while (it.hasNext()) {
                        Object elem = it.next();

                        if (elem instanceof String) {

                            String s = (String) elem;

                            if (s.contains(name)) {
                                it.remove();
                                System.out.println("removed successfully");
                            } else {
                                System.out.println("unable to remove the name");
                            }

                        }

                    }
                    break;
                case 4:
                    System.out.println("Enter a name you want to search ");
                    name = sc1.next();

                    it = l.iterator();
                    while (it.hasNext()) {
                        Object exp = it.next();

                        if (exp instanceof String) {
                            String obj = (String) exp;

                            if (obj.contains(name)) {
                                System.out.println("search name : " + obj);
                            }
                            else{
                                System.out.println("unable to search name");
                            }
                        }
                    }
                    break;
                case 5:
                    st = new TreeSet<>();
                    st.addAll(l);
                    System.out.println("sorted based on alphabetical " + st);
                    break;
                case 6:
                    StringLengthComparator slc = new StringLengthComparator();
                    TreeSet st2 = new TreeSet<>(slc);
                    st2.addAll(l);
                    System.out.println(" sorting based on lengthwise " + st2);
                    break;
                default:
                    throw new AssertionError();
                case 7:
                    System.out.println("exit");

            }
        }
         */
    }

}
