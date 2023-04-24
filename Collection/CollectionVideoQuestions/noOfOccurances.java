import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class noOfOccurances {

    public static void main(String[] args) {

        String str = "the distance between Johnson and and and and Johnson are not the same";

        String[] words = str.split(" ");

        Map<String, Integer> entry = new HashMap<String, Integer>();

        for (String s : words) {

            Integer occurance = entry.get(s);

            if (occurance == null) {

                entry.put(s, 1);

            } else {

                entry.put(s, occurance + 1);

            }

        }
        System.out.println(" no of occurances of each word in a sentence = " + entry);

    }

}
