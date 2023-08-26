import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q3 {

    public static void main(String[] args) {

        Collection col = new ArrayList<>();
        col.add("Rama");
        col.add("seetha");
        col.add("laxmana");

        System.out.println(" col = " + col);
        System.out.println(" size = " + col.size());
        System.out.println(" col " + col.remove("laxmana"));
        System.out.println(" size = " + col.size());

        Iterator it = col.iterator();

        while (it.hasNext()) {

            Object o = it.next();

            System.out.println(" col = " + o);

        }

        col.add("hanuman");
        col.add("Rama");

        System.out.println("col = " + col);

        String s2 = "Rama";
        System.out.println(col.contains(s2));

        String s3 = "Rama";
        String s4 = "Rama";
        String s5 = "Rama";

        col.add(s3);
        col.add(s4);
        col.add(s5);

        Iterator it1 = col.iterator();

        while (it1.hasNext()) {

            Object o1 = it1.next();

            if (o1 instanceof String) {

                String ts = (String) o1;

                if (ts.contains(s5)) {
                    it1.remove();

                }

            }

        }
        System.out.println("col after removing duplicates = " + col);

    }

}
