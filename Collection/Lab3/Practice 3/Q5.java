import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Q5 {

    public static void main(String[] args) {

        String sentence = "rama had a son named rama who always tells rama rama rama";
        String[] ar = sentence.split(" ");

        Map<String, Integer> m = new LinkedHashMap<String, Integer>();

        for (String s : ar) {

            Integer occurance = m.get(s);

            if (occurance == null) {
                m.put(s, 1);
            } else {
                m.put(s, occurance + 1);
            }

        }
        System.out.println(m);

    }

}
