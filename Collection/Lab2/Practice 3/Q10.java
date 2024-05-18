
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Q10 {

    public static void main(String[] args) {

        String s = "ranga";
        String s2 = "ram";
        String s3 = "Yuddishthira";
        String s4 = "sita";
        String s5 = "Krishna";
        String s6 = "Dharmaraya";
        String s7 = "Nakula";
        String s8 = "Arjuna";
        String s9 = "sahadeva";
        String s10 = "pepsi";

        StringLengthComparator slc = new StringLengthComparator();
        // TreeSet st = new TreeSet<>(slc);
        ArrayList st = new ArrayList<>();

        st.add(s);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        st.add(s6);
        st.add(s7);
        st.add(s8);
        st.add(s9);
        st.add(s10);

        st.sort(slc);
        System.out.println(st);

    }

}

class StringLengthComparator implements Comparator {

    public int compare(Object o1, Object o2) {

        if (o1 instanceof String && o2 instanceof String) {

            String s1 = (String) o1;
            String s2 = (String) o2;

            return s1.length() - s2.length();

        }
        throw new IllegalArgumentException("invalid objects passed");

    }

}
