import java.util.HashSet;
import java.util.Set;

public class Q4 {

    public static void main(String[] args) {

        Set<String> s1 = new HashSet();
        

        String sentence = "Johny Johny yes pa pa eating sugar no pa pa";
        String[] split = sentence.split(" ");

        for (int i = 0; i < split.length - 1; i++) {

            if (split[i].equals(split[i + 1])) {
                s1.add(split[i]);
            }

        }
        System.out.println(s1);
    }

}
