import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StringLengthComparator implements Comparator {

    public int compare(Object o1, Object o2) {

        if (o1 instanceof String && o2 instanceof String) {

            String s1 = (String) o1;
            String s2 = (String) o2;

            return s1.length() - s2.length();
        }
        throw new IllegalArgumentException("Invalid reference");
    }

}

class TreeTester {

    public static void main(String[] args) {

        StringLengthComparator slc = new StringLengthComparator();
        // Set st = new TreeSet(slc);

        List st = new ArrayList<>();
        st.add("rama");
        st.add("rakesh");
        st.add("ramya");
        st.add("sowmya");
        st.add("sheeba");
        st.add("amar");
        st.add("ananya");
        st.add("ponds");
        st.add("liril");
        st.add("lifeboy");
        Collections.sort(st, slc);
        System.out.println("st === > " + st);

    }

}