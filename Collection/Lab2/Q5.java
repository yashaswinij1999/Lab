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

        Iterator<String> it = col.iterator();

        while (it.hasNext()) {
            String s = it.next();

            if (s.contains("ram")) {
                it.remove();
            }
        }

        System.out.println(col);
    }
}
