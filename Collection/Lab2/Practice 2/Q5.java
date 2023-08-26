import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q5 {

    public static void main(String[] args) {

        Collection<String> col = new ArrayList<>();
        col.add("rama");
        col.add("ramanna");
        col.add("ramesha");
        col.add("bheema");
        col.add("soma");
        col.add("mama");

        Iterator it = col.iterator();

        while (it.hasNext()) {

            Object o = it.next();

            if (o instanceof String) {

                String s = (String) o;

                if (s.contains("rama")) {
                    it.remove();

                }

            }

        }
        System.out.println("after removing col = " + col);
    }

}
