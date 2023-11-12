import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Q4 {

    public static void main(String[] args) {

        Map<String, String> m1 = new HashMap<>();
        m1.put("rama", "seetha");
        m1.put("radha", "krishna");
        m1.put("shiva", "parvathi");

        System.out.println(m1.get("rama"));

        Set<String> s = m1.keySet();
        System.out.println(s);

        System.out.println(m1.remove("radha"));
        System.out.println(m1);

        Set<Entry<String, String>> entry = m1.entrySet();
        System.out.println(entry);

        Set s1 = m1.keySet();
        System.out.println(s1);

        Collection col = m1.values();
        System.out.println(col);

        System.out.println(m1.containsKey("arjuna"));

    }

}
