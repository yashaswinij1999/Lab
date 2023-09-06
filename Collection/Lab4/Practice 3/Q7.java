import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q7 {

    public static void main(String[] args) {

        String sentence = "Selfish shellfish Selfish shellfish Selfish shellfish in a beach";
        String[] split = sentence.split(" ");
        String word = "fish";
        List<String> l = new ArrayList<>();

        for (String s : split) {

            l.add(s);

        }

        Iterator<String> it = l.iterator();

        while (it.hasNext()) {

            String str = it.next();

            if (str.contains(word)) {
                it.remove();
            }

        }
        System.out.println("list after removing " + l);

    }

}
