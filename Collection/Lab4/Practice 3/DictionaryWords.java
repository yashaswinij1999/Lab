import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DictionaryWords {

    public static void main(String[] args) {

        List<String> l = Arrays.asList("cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";

        System.out.println();
        replaceWordsWithPrefix(l, sentence);

    }

    public static void replaceWordsWithPrefix(List<String> l, String sentence) {

        Set<String> st = new HashSet<>(l);
        String[] split = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        String s = "";
        String[] stm = new String[sentence.length()];

        for (String str : l) {

            String prefix = "";

            for (int i = 1; i <= str.length(); i++) {

                prefix = str.substring(0, i);

                if (l.contains(prefix)) {
                    break;
                }

            }
            sb.append(prefix).append(" ");

        }
        s = sb.toString();

        String[] sp = s.split(" ");

        List<String> lt = new ArrayList<>();

        for (String str : sp) {

            l.add(str);

        }

        for (int i = 0; i < split.length; i++) {

            if (l.get(i).contains(s)) {
                System.out.println(l.get(i));
            }

        }

    }

}
