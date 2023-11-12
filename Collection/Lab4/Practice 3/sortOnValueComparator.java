import java.util.Comparator;
import java.util.Map;
import java.util.Set;

import javax.swing.RowFilter.Entry;

public class sortOnValueComparator implements Comparator {

    Map<String, Integer> m;

    public sortOnValueComparator(Map<String, Integer> m) {

        this.m = m;

    }

    public int compare(Object o1, Object o2) {

        if (o1 instanceof String && o2 instanceof String) {

            String s1 = (String) o1;
            String s2 = (String) o2;

            return m.get(s1) - m.get(s2);

        }
        throw new IllegalArgumentException();

    }

}
