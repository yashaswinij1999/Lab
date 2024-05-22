
import java.util.Comparator;
import java.util.Map;

public class SortOnValueComparator implements Comparator {

    Map<String, String> t = null;

    public SortOnValueComparator(Map t) {
        this.t = t;
    }

    @Override
    public int compare(Object o1, Object o2) {

        if (o1 instanceof String && o2 instanceof String) {

            String s1 = (String) o1;
            String s2 = (String) o2;

            return t.get(s1).compareTo(t.get(s2));

        }
        throw new IllegalArgumentException("Invalid Map passed");

    }

}
