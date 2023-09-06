import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

import java.util.concurrent.CountDownLatch;

public class SimpleQ5 {

    public static void main(String[] args) {

        String sentence = "Can you can a can as a canner can can a can";
        String[] words = sentence.split(" ");
        List<String> l = Arrays.asList(words);
        int count = 0;

        // a.Using Collections
        for (String s : l) {

            count = Collections.frequency(l, s);
            System.out.println(s + " " + " occurs = " + count + " time ");

        }

        // Using Maps
        Map<String, Integer> m = new HashMap<String, Integer>();

        for (String s2 : words) {
            Integer occurance = m.get(s2);

            if (occurance == null) {
                m.put(s2, 1);
            }
            else{
                m.put(s2, occurance + 1);
            }

        }
        System.out.println( " m = " + m);

    }

}
