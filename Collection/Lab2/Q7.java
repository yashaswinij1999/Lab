import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Q7 {

    public static void main(String[] args) {

        String sentence = "Johny Johny yes pa pa eating sugar no pa pa";
        String[] split = sentence.split(" ");

        Set s1 = new HashSet<>();
        Set s2 = new LinkedHashSet<>();

        for (String str1 : split) {
            s1.add(str1);
        }
        System.out.println("s1 == " + s1);

        for (String str2 : split) {
            s2.add(str2);
        }
        System.out.println("s1 == " + s2);
    }

}
