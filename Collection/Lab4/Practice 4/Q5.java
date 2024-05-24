
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q5 {

    public static void main(String[] args) {

        String s = "this this is is a what how what is";
        String[] arr = s.split(" ");
        ArrayList<String> l = new ArrayList<>();

        // for (String st : arr) {
        //     l.add(st);
        //     System.out.println("the word " + st + " occurs " + Collections.frequency(l, st));
        // }
        Map<String, Integer> m = new LinkedHashMap<>();

        for (String st : arr) {
            Integer i = m.get(st);

            if (i == null) {
                m.put(st, 1);
            } else {
                m.put(st, i + 1);
            }
        }

        System.out.println(m);

    }

}
