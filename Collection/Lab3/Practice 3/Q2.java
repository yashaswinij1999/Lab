import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int ch = 0;
        String name, removeFriendName, partofString;

        List<String> l = new ArrayList<>();

        while (ch != 7) {

            System.out.println("");
            System.out.println("Press 1 to add friend name");
            System.out.println("Press 2 to list friend name");
            System.out.println("Press 3 to remove the friend name");
            System.out.println("Press 4 to Search for friend names given a part string");
            System.out.println("Press 5 to Sort the friend names based on i) alphabetical");
            System.out.println("Press 6 to Sort the friend names based on ii) lengthwise");
            System.out.println("Press 7 to exit");
            System.out.println("");

            System.out.println("Enter your choice ");
            ch = sc1.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("Enter the friend name");
                    name = sc1.next();

                    if (UtilMethods.Validate(name)) {
                        l.add(name);
                    }
                    break;

                case 2:
                    System.out.println("to list");
                    System.out.println(l);

                    break;

                case 3:
                    System.out.println("enter the friend name which you want to remove");
                    removeFriendName = sc1.next();

                    if (UtilMethods.Validate(removeFriendName)) {

                        Iterator<String> it = l.iterator();

                        while (it.hasNext()) {

                            String remove = it.next();

                            if (l.contains(removeFriendName)) {

                                System.out.println(removeFriendName);
                                it.remove();

                            }

                        }

                    }

                    break;

                case 4:
                    System.out.println("to search");
                    partofString = sc1.next();

                    Iterator<String> it = l.iterator();

                    while (it.hasNext()) {

                        String search = it.next();

                        if (search.contains(partofString)) {
                            System.out.println(search);
                        }

                    }

                    break;

                case 5:
                    System.out.println("sort on alphabetical order");

                    Collections.sort(l);
                    System.out.println(l);
                    break;

                case 6:
                    System.out.println("sort on length wise");
                    StringLengthComparator sc = new StringLengthComparator();
                    Collections.sort(l, sc);
                    System.out.println(l);
                    break;

                default:
                    System.out.println("invalid output");
                    break;

                case 7:
                    System.out.println("bye bye");
            }

        }

    }

}