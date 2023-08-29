import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("enter the sentence");
        String sentence = sc1.nextLine();

        System.out.println("enter the word");
        String word = sc1.next();

        String[] arr = sentence.split(" ");

        List<String> l = new ArrayList<>();
        Set<String> st = new TreeSet<>();

        for (String s : arr) {
            l.add(s);
            st.add(s);
        }

        System.out.println("the number of times the word " + word + " occurs " + Collections.frequency(l, word));

        Collections.sort(l);
        System.out.println("sorting with duplictes = " + l);
        System.out.println("sorting without duplictes = " + st);

        StringLengthComparator sl = new StringLengthComparator();
        Collections.sort(l, sl);
        System.out.println(l);

        Iterator<String> it = l.iterator();

        while (it.hasNext()) {

            String str = it.next();

            if (str.contains(word)) {
                it.remove();
            }
        }
        System.out.println(l);

    }

}
