
import java.util.Comparator;
import java.util.TreeSet;

public class Q6 {

    public static void main(String[] args) {

        String s = "I am so blue I'm greener than purple";
        String[] arr = s.split(" ");

        reverseAlphabeticalOrderComparator r = new reverseAlphabeticalOrderComparator();
        StringLengthComparator slc = new StringLengthComparator();
        noOfVowelsComparator n = new noOfVowelsComparator();
        TreeSet<String> st = new TreeSet<>(n);

        for (String str : arr) {
            st.add(str);
        }

        // System.out.println("comaparison on Alphabetical Order " + st);
        // System.out.println("comaparison on length " + st);
        System.out.println("comaparison on reverseAlphabeticalOrder " + st);
    }

}

class StringLengthComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        if (o1 instanceof String && o2 instanceof String) {

            String s1 = (String) o1;
            String s2 = (String) o2;

            return s1.length() - s2.length();

        }
        throw new IllegalArgumentException("illegal argument passed in lenghth comparator");

    }

}

class reverseAlphabeticalOrderComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof String && o2 instanceof String) {
            String s1 = (String) o1;
            String s2 = (String) o2;

            return s2.compareTo(s1);
        }
        throw new IllegalArgumentException("illegal argument passed in reverseAlphabeticalOrderComparator comparator");
    }

}

class noOfVowelsComparator implements Comparator {

    public int findVowels(String s) {

        int vowels = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            c = Character.toLowerCase(c);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }

        }
        return vowels;

    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof String && o2 instanceof String) {

            String s1 = (String) o1;
            String s2 = (String) o2;

            return findVowels(s1) - findVowels(s2);

        }
        throw new IllegalArgumentException("illegal argument passed in noOfVowelsComparator comparator");
    }

}
