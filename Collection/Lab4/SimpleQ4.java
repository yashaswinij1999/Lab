import java.util.HashSet;
import java.util.Set;

public class SimpleQ4 {

    public static void main(String[] args) {

        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();
        String sentence = "Fred fed Ted bread and Ted fed Fred bread";
        String[] words = sentence.split(" ");

        for (String s : words) {

            if (!s1.add(s))
                s2.add(s);
            // s2 contains all non unique words
        }
        System.out.println("s2 ====> " + s2);

        String temp = "";
        for (String nonUnique : s2) {

            temp = temp + " " + nonUnique;
        }
        System.out.println(" non Unique words = " + temp);

    }

}
