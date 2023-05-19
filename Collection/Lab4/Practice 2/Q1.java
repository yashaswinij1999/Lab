import java.util.HashMap;
import java.util.Map;

public class Q1 {

    public static void main(String[] args) {

        Map<String, Integer> m1 = new HashMap();

        String sentence = "Mary had a little Lamp";
        String[] split = sentence.split(" ");

        for (String s : split) {
            Integer occurance = m1.get(s);

            if (occurance == null) {
                m1.put(s, 1);
            } else {
                m1.put(s, occurance + 1);
            }

        }

        System.out.println("m1 ===> " + m1);

    }
}