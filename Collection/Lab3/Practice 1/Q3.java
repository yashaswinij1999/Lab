import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println(" Enter input ");
        String sentence = sc2.nextLine();
        System.out.println(" sentence = " + sentence);
        System.out.println("-------------------------------------------------");

        System.out.println(" please provide a input word");
        String word = sc1.next();
        System.out.println(" word = " + word);

        List<String> l = new ArrayList<String>();
        String[] str = sentence.split(" ");
        for (String s1 : str) {

            l.add(s1);

        }
        System.out.println(" the words added to the list = " + l);

        // sorting using collections.frequency
        System.out.println(" no of occurances of word in the given sentence = " + Collections.frequency(l, word));

        // sorting with duplicates
        Collections.sort(l);
        System.out.println(" sorting of words with duplicates = " + l);

        // sorting without duplicates
        Set st = new TreeSet();
        for (String s2 : str) {
            st.add(s2);
        }
        System.out.println(" sorting of elements without duplicates " + st);

        // remove all the occurrences of the word from the sentence
        String temp = "";
        for (String s3 : l) {
            if (!s3.equals(word))
                temp = temp + " " + s3;
        }
        System.out.println(" removing all the occurances of the word ===> " + temp);

    }

}
