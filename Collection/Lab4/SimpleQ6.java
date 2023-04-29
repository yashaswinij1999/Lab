import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SimpleQ6 {

    public static void main(String[] args) {

        List<String> l = new ArrayList<String>();
        stringLengthComparator slc = new stringLengthComparator();
        sortonAlphabetsComparator sac = new sortonAlphabetsComparator();
        reverseSortOnAlphabetsComparator rsac = new reverseSortOnAlphabetsComparator();
        sortOnVowelsComparator svc = new sortOnVowelsComparator();
        Scanner sc = new Scanner(System.in);
        int ch = 0;

        while (ch != 6) {
            System.out.println("Enter 1 to add");
            System.out.println("Enter 2 to sort based on length");
            System.out.println("Enter 3 to sort based on Alphabetical Order");
            System.out.println("Enter 4 to sort based on Reverse Alphabetical Order");
            System.out.println("Enter 5 to to sort based on no of vowels ");
            System.out.println("Enter 6 to exit");
            System.out.println("Enter your choice ");
            ch = sc.nextInt();
            System.out.println("choice entered = " + ch);

            switch (ch) {

                case 1:
                    System.out.println("Enter input ===== >");
                    String input = sc.next();
                    l.add(input);
                    break;

                case 2:
                    System.out.println(" sorting based on Length ");
                    Collections.sort(l, slc);
                    System.out.println(" l = " + l);
                    break;

                case 3:
                    System.out.println("Enter 3 to sort based on Alphabetical Order");
                    Collections.sort(l, sac);
                    System.out.println(" l = " + l);
                    break;

                case 4:
                    System.out.println("Enter 3 to sort based on Reverse Alphabetical Order");
                    Collections.sort(l, rsac);
                    System.out.println(" l = " + l);
                    break;

                case 5:
                    System.out.println("Enter 5 to to sort based on no of vowels ");
                    Collections.sort(l, svc);
                    System.out.println(" l " + l);
                    break;

                default:
                    System.out.println("Enter proper input ");
                    break;

                case 6:
                    System.out.println(" bye bye");

            }
        }

    }

}
