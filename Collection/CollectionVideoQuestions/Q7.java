import java.util.HashSet;
import java.util.Set;

public class Q7 {

    public static void main(String[] args) {

        String str = "and and is is the ";

        String[] words = str.split(" ");

        Set s1 = new HashSet();
        Set s2 = new HashSet();

        for (String st1 : words) {

            if (!s1.add(st1)) {
                s2.add(st1);
            }
        }
        s1.removeAll(s2);

        System.out.println(" non repeated word in a given sentence = " + s1);

    }

}
