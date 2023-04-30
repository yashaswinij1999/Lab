import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Q5 {

    public static void main(String[] args) {

        Map<String, String> m1 = new TreeMap<String, String>();
        m1.put("Rama", "Seetha");
        m1.put("Krishna", "Radhe");
        m1.put("Shiva", "Parvathi");
        m1.put("Vishnu", "Lakshmi");
        m1.put("Arjuna", "Subhadra");
        System.out.println(m1);

        Map<String, String> m2 = new TreeMap<String, String>(new sortValueComparator(m1));
        Set<Entry<String, String>> st = m1.entrySet();

        for (Entry<String, String> en : st) {
            m2.put(en.getKey(), en.getValue());
        }
        System.out.println("sorting on value = " + m2);

    }

}
