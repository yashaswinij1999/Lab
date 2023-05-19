import java.util.HashMap;
import java.util.Map;

public class Q1 {

    public static void main(String[] args) {

        Map<String, Integer> m1 = new HashMap();

        String sentence = "Johny Johny yes pa pa eating sugar no pa pa";
        String[] split = sentence.split(" ");
        String word = "pa";
        int count = 0;

        for (String s : split) {

            if (s.equals(word)) {
                count++;
            }

        }

        System.out.println("a word " + word + " occurs " + count + " no of times ");

    }
}