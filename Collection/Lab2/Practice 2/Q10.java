import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Q10 {

    public static void main(String[] args) {

        StringLengthComparator slc = new StringLengthComparator();
        String s1 = "Nineteen";
        String s2 = "o";
        String s3 = "two";
        String s4 = "Eight";
        String s5 = "twenty";
        String s6 = "yashaswini";
        String s7 = "arjuna";
        String s8 = "keerthi";
        String s9 = "annu";
        String s10 = "om";

        TreeSet<String> ts = new TreeSet<String>(slc);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);
        ts.add(s8);
        ts.add(s9);
        ts.add(s10);
        System.out.println(ts);

        List<String> l = new ArrayList<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        l.add(s5);
        l.add(s6);
        l.add(s7);
        l.add(s8);
        l.add(s9);
        l.add(s10);
        Collections.sort(l);
        System.out.println(l);

    }

}

class StringLengthComparator implements Comparator<String> {

    public int compare(String o1, String o2) {

        if (o1 instanceof String && o2 instanceof String) {

            String s1 = (String) o1;
            String s2 = (String) o2;

            return s1.length() - s2.length();

        }
        throw new IllegalArgumentException();

    }

}
