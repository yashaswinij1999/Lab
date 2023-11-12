import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Question5 {

    public static void main(String[] args) {

        Map<String, Integer> m = new HashMap<>();
        m.put("Rama", 24);
        m.put("seetha", 25);
        m.put("hanuman", 14);

        TreeMap<String, Integer> t = new TreeMap<>(new sortOnValueComparator(m));
        // TreeMap<String, Integer> t = new TreeMap<>();

        Set<Entry<String, Integer>> s = m.entrySet();

        for (Entry<String, Integer> entry : s) {

            t.put(entry.getKey(), entry.getValue());

        }
        System.out.println(t);

    }

}
