import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q14 {

    public static void main(String[] args) {

        String sentence = "Can you can a can as a canner can can a can";
        String[] split = sentence.split(" ");
        List<String> l1 = new ArrayList<>();

        for (String s : split) {
            l1.add(s);
        }

        for (int i = 0; i < l1.size(); i++) {

            for (int j = i + 1; j < l1.size(); j++) {

                if (l1.get(i).equals(l1.get(j))) {
                    l1.remove(i);
                }
            }
        }

        System.out.println(l1);

    }

}
