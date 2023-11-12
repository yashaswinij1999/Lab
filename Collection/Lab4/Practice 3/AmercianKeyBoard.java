import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AmercianKeyBoard {

    public static void main(String[] args) {

        String s = "Hello Alaska Dad Peace";
        List<String> l = new ArrayList<>();

        String[] split = s.split(" ");

        for (String str : split) {
            l.add(str);
        }

        System.out.println(isInOneRowInTheKeyBoard(l));

    }

    public static String isInOneRowInTheKeyBoard(List<String> l) {

        String s = "";
        List<String> lt = new ArrayList<>();

        List<Character> l1 = Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
        Set<Character> s1 = new HashSet<>(l1);

        List<Character> l2 = Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
        Set<Character> s2 = new HashSet<>(l2);

        List<Character> l3 = Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm');
        Set<Character> s3 = new HashSet<>(l3);

        for (String str : l) {

            char c = Character.toLowerCase(str.charAt(0));
            Set<Character> st = new HashSet<>();

            if (s1.contains(c)) {
                st = s1;
            } else {

                if (s2.contains(c)) {
                    st = s2;

                } else {

                    if (s3.contains(c)) {
                        st = s3;
                    }

                }

            }

            boolean isValid = true;

            for (int i = 0; i < str.length(); i++) {

                char ch = Character.toLowerCase(str.charAt(i));

                if (!st.contains(ch)) {
                    isValid = false;
                    break;
                }

            }

            if (isValid) {

                lt.add(str);

            }

        }

        for (String ts : lt) {

            s = s + " " + ts;

        }

        return s;

    }

}
