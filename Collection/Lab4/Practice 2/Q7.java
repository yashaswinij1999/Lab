import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q7 {

    public static void main(String[] args) {

        String sentence = "Johny Johny yes pa pa eating sugar no pa pa";
        String[] split = sentence.split(" ");
        String word = "pa";

        Set<String> s = new HashSet();
        for (String str : split) {
            s.add(str);
        }

        Iterator<String> it = s.iterator();

        while (it.hasNext()) {
            String val = it.next();

            if (val.equals(word)) {
                it.remove();
            }
        }

        System.out.println(" after removing word pa = " + s);
    }

}
