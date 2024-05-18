
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter sentence");
        String sentence = sc1.nextLine();

        System.out.println("Enter word");
        String word = sc2.next();

        List c = new ArrayList<>();
        TreeSet st = new TreeSet<>();

        String[] split = sentence.split(" ");

        for (String s : split) {
            c.add(s);
            st.add(s);
        }
        System.out.println("we are able to find the word : " + word + " " + Collections.frequency(c, word) + " no of times");

        Collections.sort(c);
        System.out.println(" sorting with duplicates " + c);
        System.out.println(" sorting without duplicates " + st);

    }

}
