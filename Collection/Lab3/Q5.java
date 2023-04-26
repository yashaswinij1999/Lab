import java.util.HashMap;
import java.util.Map;

public class Q5 {

    public static void main(String[] args) {

        String s = "Can you can a can as a canner can can a can";
        String[] ca = s.split(" ");

        Map<String, Integer> m = new HashMap<String, Integer>();

        for (String s1 : ca) {

            Integer occurance = m.get(s1);

            if (occurance == null) {

                m.put(s1, 1);

            } else {

                m.put(s1, occurance + 1);
                
            }

        }
        System.out.println(m);

    }
}