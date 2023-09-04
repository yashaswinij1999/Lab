import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q4 {

    public static void main(String[] args) {

        String sentence = "Betty Botter bought some butter but she said the butter bitter If I put it in my batter it will make my batter bitter";
        String[] words = sentence.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase to treat words as case-insensitive
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print non-unique words
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("unique word: " + entry.getKey());
            }
        }

    }

}
