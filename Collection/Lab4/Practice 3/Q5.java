import java.util.LinkedHashMap;
import java.util.Map;

public class Q5 {

    public static void main(String[] args) {

        String sentence = "Betty Botter bought some butter but she said the butter bitter If I put it in my batter it will make my batter bitter";
        String[] words = sentence.split(" ");

        Map<String, Integer> m = new LinkedHashMap<>();

        for (String str : words) {

            Integer occurance = m.get(str);

            if (occurance == null) {

                m.put(str, 1);

            } else {

                m.put(str, occurance + 1);

            }

        }

        System.out.println(m);

    }

}
