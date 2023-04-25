import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        List<String> friendName = new ArrayList();
        String name;
        int ch = 0;

        while (ch != 6) {

            System.out.println("---------------------------------------------------------");
            System.out.println("Press 1 to add names");
            System.out.println("Press 2 to list names");
            System.out.println("Press 3 to remove names");
            System.out.println("Press 4 to Search for  names given a part string names");
            System.out.println("Press 5 to sort names based on alphabetical order ");
            System.out.println("Press 6 to exit");

            System.out.println("---------------------------------------------------------");
            System.out.println(" Press channel to enter your choice ");

            ch = sc1.nextInt();

            System.out.println(" choice entered = " + ch);

            switch (ch) {

                case 1:
                    System.out.println(" add friend name ");

                    name = sc1.next();
                    friendName.add(name);
                    break;

                case 2:

                    System.out.println("listing ");

                    System.out.println(" friend name = " + friendName);
                    break;

                case 3:

                    System.out.println(" remove ");

                    System.out.println(" Enter the name which need to be removed ");

                    String removeName = sc1.next();

                    if (friendName.contains(removeName)) {

                        friendName.remove(removeName);

                        System.out.println(" name removed successfully ");
                    }
                    break;

                case 4:

                    System.out.println(" please enter part of the name ");
                    String partName = sc1.next();

                    for (String s : friendName) {

                        if (s.contains(partName)) {
                            System.out.println(" friend name = " + s);
                        }
                    }

                    break;

                case 5:

                    StringLengthComparator slc = new StringLengthComparator();
                    System.out.println(" sorting based on alphabetical order ");
                    Collections.sort(friendName);
                    System.out.println(" names after sorting = " + friendName);
                    break;

                case 6:
                    System.out.println(" ok tata bye bye ");

            }

        }

    }

}

class StringLengthComparator {

    public int compareTo(String s1, String s2) {

        return s1.length() - s2.length();

    }
}
