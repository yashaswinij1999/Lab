import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Q1 {

    public static void main(String[] args) {

        String s = "The cat chased its tail in circles circles and more circles";
        String word = "circles";

        noOfTimesAWordOccursInASentence(s, word);

    }

    public static void noOfTimesAWordOccursInASentence(String sentence, String word) {

        String[] arr = sentence.split(" ");

        List<String> l = new ArrayList<>();

        for (String str : arr) {

            l.add(str);

            System.out.println(" the no of times the word " + word + " occurs " + Collections.frequency(l, word));

        }

    }

}