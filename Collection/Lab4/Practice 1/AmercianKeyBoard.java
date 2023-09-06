import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AmercianKeyBoard {

    public static void main(String[] args) {

        String sentence = "Hello Alaska Dad Peace";
        String[] split = sentence.split(" ");
        List<String> l = new ArrayList<>();

        for (String word : split) {
            l.add(word);
        }

        findWordsofSameRow(l);
    }

    public static void findWordsofSameRow(List<String> l) {

        List<String> l4 = new ArrayList<>();
        String str = "";

        List<Character> l1 = Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
        Set<Character> s1 = new HashSet<>(l1);

        List<Character> l2 = Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
        Set<Character> s2 = new HashSet<>(l2);

        List<Character> l3 = Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm');
        Set<Character> s3 = new HashSet<>(l3);

        for (String string : l) {

            Set<Character> current;

            char firstchar = Character.toLowerCase(string.charAt(0));

            if (s1.contains(firstchar)) {
                current = s1;
            } else {

                if (s2.contains(firstchar)) {
                    current = s2;
                } else {
                    s3.contains(firstchar);
                    current = s3;

                }
            }

            boolean isValid = true;

            for (int i = 0; i < string.length(); i++) {

                char c = Character.toLowerCase(string.charAt(i));
                if (!current.contains(c)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {

                l4.add(string);
            }

        }
        for (String st : l4) {

            str = str + " " + st;
        }
        System.out.println(str);
    }

}
