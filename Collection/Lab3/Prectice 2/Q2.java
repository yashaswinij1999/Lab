import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringLengthComparator slc = new StringLengthComparator();
        List<String> l = new ArrayList();
        Set<String> ts = new TreeSet<>(l);
        int ch = 0;
        String name;

        while (ch != 7) {
            System.out.println("Press 1 : Add a friend name");
            System.out.println("Press 2: List the friend names");
            System.out.println("Press 3 : Remove a friend name");
            System.out.println("Press 4 : Search for friend names given a part string");
            System.out.println("Press 5 : Sort the friend names based on i) alphabetical");
            System.out.println("Press 6 : Sort the friend names based on ii) lengthwise ");
            System.out.println("Press 7 : to exit ");
            System.out.println("Please enter your choice ");
            ch = sc.nextInt();
            System.out.println("choice entered = " + ch);

            switch (ch) {

                case 1:
                    System.out.println("Enter  friend name");
                    name = sc.next();
                    l.add(name);
                    break;

                case 2:
                    System.out.println("List the friend names");
                    System.out.println(" l===> " + l);
                    break;

                case 3:
                    System.out.println("Remove a friend name");
                    String remove = sc.next();
                    l.remove(remove);
                    break;

                case 4:
                    System.out.println("Enter part of name");
                    String partName = sc.next();

                    for (String s : l) {
                        if (s.contains(partName)) {
                            System.out.println("l == " + s);
                        }
                    }
                    break;

                case 5:
                    System.out.println("sorting based on alphabets");
                    ts.addAll(l);
                    System.out.println(ts);
                    break;

                case 6:
                    System.out.println("sorting based on length");
                    Collections.sort(l, slc);
                    System.out.println("l == " + l);
                    break;

                default:
                    System.out.println("enter right input");
                    break;

                case 7:
                    System.out.println("ok bye bye");
            }
        }

    }

}

class StringLengthComparator implements Comparator {

    public int compare(Object o1, Object o2) {

        if (o1 instanceof String && o2 instanceof String) {

            String s1 = (String) o1;
            String s2 = (String) o2;

            return s1.length() - s2.length();
        }
        throw new IllegalArgumentException("Invalid reference");
    }

}