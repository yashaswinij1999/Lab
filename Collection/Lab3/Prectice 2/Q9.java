import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Q9 {

    public static void main(String[] args) {

        Map<String, Integer> m1 = new TreeMap();
        Map<String, Integer> m2 = new TreeMap(new sortComparator(m1));
        m1.put("ondh", 1);
        m1.put("eradu", 10);
        m1.put("muru", 84);
        m1.put("nalaku", 105);
        m1.put("hidu", 5);

        Set<Entry<String, Integer>> st = m1.entrySet();

        for (Entry<String, Integer> entry : st) {
            m2.put(entry.getKey(), entry.getValue());
        }
        System.out.println(m2);

    }

}

class sortComparator implements Comparator {

    Map<String, Integer> m1;

    public sortComparator(Map<String, Integer> m1) {
        this.m1 = m1;
    }

    public int compare(Object o1, Object o2) {

        if (o1 instanceof String && o2 instanceof String) {

            String s1 = (String) o1;
            String s2 = (String) o2;

            return m1.get(s1) - m1.get(s2);

        }
        throw new IllegalArgumentException("Invalid");
    }

}