import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AmericanKeyBoard {

    public static void main(String[] args) {

        String sentence = "Hello Alaska Dad Peace";
        String[] split = sentence.split(" ");

        List<String> l = new ArrayList<>();

        for (String s : split) {
            l.add(s);
        }

        isLettersAreInTheSameRow(l);

    }

    public static void isLettersAreInTheSameRow(List<String> l) {

        List<String> l4 = new ArrayList<>();
        String str = "";

        List<Character> l1 = Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
        Set<Character> s1 = new HashSet<>(l1);

        List<Character> l2 = Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
        Set<Character> s2 = new HashSet<>(l2);

        List<Character> l3 = Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm');
        Set<Character> s3 = new HashSet<>(l3);

        for (String s : l) {

            char firstChar = Character.toLowerCase(s.charAt(0));
            Set<Character> current = new HashSet();

            if (s1.contains(firstChar)) {
                current = s1;

            } else {

                if (s2.contains(firstChar)) {

                    current = s2;

                } else {

                    s3.contains(firstChar);
                    current = s3;

                }
            }

            boolean isValid = true;

            for (int i = 0; i < s.length(); i++) {

                char c = Character.toLowerCase(s.charAt(i));

                if (!current.contains(c)) {
                    isValid = false;
                    break;
                }

            }

            if (isValid) {
                l4.add(s);
            }

        }
        for (String str1 : l4) {
            str = str + " " + str1;
        }
        System.out.println(str);
    }
}
