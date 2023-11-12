import java.util.Comparator;
import java.util.Map;

public class sortBasedOnValueComparator implements Comparator {

    Map<String, String> m;

    public sortBasedOnValueComparator(Map<String, String> m) {

        this.m = m;

    }

    public int compare(Object o1, Object o2) {

        if (o1 instanceof String && o2 instanceof String) {

            String s1 = (String) o1;
            String s2 = (String) o2;

            return m.get(s1).compareTo(m.get(s2));

        }

        throw new IllegalArgumentException("Invalid Input");

    }

}
