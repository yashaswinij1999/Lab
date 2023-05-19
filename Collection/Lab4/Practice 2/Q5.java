import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q5 {

    public static void main(String[] args) {

        String sentence = "Johny Johny yes pa pa eating sugar no pa pa";
        String[] split = sentence.split(" ");

        List<String> l = new ArrayList();

        for (String s : split) {
            l.add(s);
            System.out.println(s + " occurs " + Collections.frequency(l, s));
        }

        Map<String, Integer> m1 = new HashMap<>();

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
