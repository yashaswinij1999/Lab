
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Q9 {

    public static void main(String[] args) {

        TreeMap t = new TreeMap<>();
        t.put("rama", "sita");
        t.put("krishna", "radhe");
        t.put("shiva", "parvati");
        t.put("vishnu", "lakshmi");

        TreeMap t2 = new TreeMap<>(new SortOnValueComparator(t));

        Set<Entry<String, String>> st = t.entrySet();

        for (Entry<String, String> e : st) {
            t2.put(e.getKey(), e.getValue());
        }

        System.out.println(t2);

    }

}
