import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.nextLine();
        String[] split = word.split(" ");

        StringLengthComparator slc = new StringLengthComparator();
        List<String> l = new ArrayList();
        for (String s : split) {
            l.add(s);
        }
        Collections.sort(l, slc);
        System.out.println("sort on length = " + l);



        Set<String> s1 = new TreeSet<>();
        for (String s : split) {
            s1.add(s);
        }
        System.out.println("sort on Alphabetical Order = " + s1);




        ReverseAlphabeticalOrderComparator raoc = new ReverseAlphabeticalOrderComparator();
        Set<String> s2 = new TreeSet<>(raoc);
        for (String s : split) {
            s2.add(s);
        }
        System.out.println("sort on Alphabetical Order = " + s2);



        NoOfVowelsInEachWordComparator nov = new NoOfVowelsInEachWordComparator();
        List<String> l2 = new ArrayList();
        for (String s : split) {
            l2.add(s);
        }
        Collections.sort(l2, nov);

        System.out.println("sort on No Of Vowels In Each Word Comparator = " + l2);

    }

}

class StringLengthComparator implements Comparator {

    public int compare(Object o1, Object o2) {

        String s1 = (String) o1;
        String s2 = (String) o2;

        return s1.length() - s2.length();
    }

}

class ReverseAlphabeticalOrderComparator implements Comparator {

    public int compare(Object o1, Object o2) {

        String s1 = (String) o1;
        String s2 = (String) o2;

        return s2.compareTo(s1);
    }

}

class NoOfVowelsInEachWordComparator implements Comparator {

    public int compare(Object o1, Object o2) {

        String s1 = (String) o1;
        int vowel1 = 0;

        for (int i = 0; i < s1.length(); i++) {

            char c = s1.charAt(i);

            if (Character.isLowerCase(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowel1++;
                }
            }

        }

        String s2 = (String) o2;
        int vowel2 = 0;

        for (int i = 0; i < s2.length(); i++) {

            char c = s2.charAt(i);

            if (Character.isLowerCase(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowel2++;
                }
            }
        }

        return vowel1 - vowel2;
    }
}