
import java.util.ArrayList;
import java.util.Iterator;

public class Q7 {

    public static void main(String[] args) {

        String s = "this this is is a what how what is";
        String[] str = s.split(" ");
        ArrayList l = new ArrayList<>();
        String word = "is";

        for (String st : str) {
            l.add(st);
        }

        Iterator it = l.iterator();

        while (it.hasNext()) {
            Object elem = it.next();

            if (elem instanceof String) {

                String s2 = (String) elem;

                if (s2.contains(word)) {
                    it.remove();
                }

            }

        }
        System.out.println(l);

    }

}
