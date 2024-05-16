
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q5 {

    public static void main(String[] args) {

        ArrayList a = new ArrayList<>();
        a.add("rama");
        a.add("ramanna");
        a.add("ramesha");
        a.add("bheema");
        a.add("soma");
        a.add("mama");

        Iterator it = a.iterator();

        while (it.hasNext()) {
            Object elem = it.next();

            if (elem instanceof String) {

                String s = (String) elem;

                if (s.contains("ram")) {
                    it.remove();
                }

            }

        }
        System.out.println(a);

    }

}
