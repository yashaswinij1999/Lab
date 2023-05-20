import java.util.Map.*;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Q5 {

    public static void main(String[] args) {

        Map<String, Integer> m1 = new TreeMap();
        m1.put("ram", 14);
        m1.put("santu", 12);
        m1.put("shama", 2);
        m1.put("kanaka", 16);
        m1.put("bhama", 8);
        m1.put("soma", 6);

        

        Map<String, Integer> m2 = new TreeMap(new SortingComparator(m1));
        Set<Entry<String, Integer>> s = m1.entrySet();

        for (Entry<String, Integer> entries : s) {
            m2.put(entries.getKey(), entries.getValue());
        }
        System.out.println(m2);
    }

}

class SortingComparator implements Comparator {

    Map<String, Integer> m1;

    public SortingComparator(Map<String, Integer> m1) {
        this.m1 = m1;
    }

    public int compare(Object o1, Object o2) {

        if (o1 instanceof String && o1 instanceof String) {
            String s1 = (String) o1;
            String s2 = (String) o2;

            return m1.get(s1) - m1.get(s2);
        }
        throw new IllegalArgumentException();
    }

}
