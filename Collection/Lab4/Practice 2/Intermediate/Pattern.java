import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Pattern {

    public static void main(String[] args) {

        String pattern = "abba";
        String str = "dog cat dog dog";
        System.out.println(isMatching(pattern, str));
    }

    public static boolean isMatching(String pattern, String str) {

        String[] s = str.split(" ");
        char[] c = pattern.toCharArray();

        if (s.length != c.length) {
            return false;
        }

        Map<String, Character> map = new HashMap<>();

        for (int i = 0; i < s.length; i++) {

            if (!map.containsKey(s[i]) && !map.containsValue(c[i])) {
                map.put(s[i], c[i]);

            } else {

                if (!map.containsKey(s[i]) && map.containsValue(c[i])) {
                    return false;
                }

                else {

                    if (c[i] != map.get(s[i])) {
                        return false;
                    }
                }
            }
        }
        return true;

    }
}