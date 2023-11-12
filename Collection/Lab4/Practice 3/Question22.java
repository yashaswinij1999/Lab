
import java.util.HashMap;
import java.util.Map;

public class Question22 {

    public static void main(String[] args) {

        String str = "abba";
        String pattern = "dog cat cat dog";

        System.out.println(IsPattern(pattern, str));

    }

    public static boolean IsPattern(String pattern, String str) {

        Map<String, Character> m1 = new HashMap<>();
        char[] ch = str.toCharArray();
        String[] split = pattern.split(" ");

        for (int i = 0; i < split.length; i++) {

            if (!m1.containsKey(ch[i]) || !m1.containsValue(split[i])) {
                m1.put(split[i], ch[i]);

            } else {

                if (!m1.containsKey(split[i]) && m1.containsValue(ch[i])) {
                    return false;

                } else {

                    if (ch[i] != m1.get(split[i])) {
                        return false;
                    }
                }

            }

        }
        return true;

    }

}
