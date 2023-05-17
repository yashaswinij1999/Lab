import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence");
        String sentence = sc.nextLine();
        String[] split = sentence.split(" ");

        System.out.println("Enter word");
        String word = sc.next();

        StringLengthComparator slc = new StringLengthComparator();
        List<String> l = new ArrayList<>();

        for (String s : split) {
            l.add(s);
        }

        System.out.println("no of occurance of word " + word + " = " + Collections.frequency(l, word));

        Collections.sort(l);
        System.out.println("sorting with duplcates = " + l);

        Set <String> ts = new TreeSet<>();
        ts.addAll(l);
        System.out.println("sorting without duplicates = " + ts);

        Set <String> ts = new TreeSet<>(slc);
        System.out.println(" sort using string length comparison" + ts);

        Iterator<String> it = l.iterator();
        while(it.hasNext()){
            String val = it.next();

            if(val.equals(word)){
                it.remove();
            }
        }

        System.out.println(" remove all the occurrences of the word = " + l);

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