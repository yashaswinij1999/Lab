
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollections {

    public static void main(String[] args) {

        Collection<String> arr = new ArrayList<String>();
        arr.add("rama");
        arr.add("sita");
        arr.add("hanumantha");
        arr.add("keshava");
        arr.add("rama");

        /* 
        System.out.println(arr.remove("keshava"));
        System.out.println(arr);
        System.out.println(arr.contains("keshava"));

        Iterator it = arr.iterator();
        while (it.hasNext()) {
            Object elem = it.next();

            if (elem instanceof String) {

                String s = (String) elem;
                System.out.println(s);
            }

        }
         */
        String s1 = "rama";
        arr.add(s1);
        System.out.println(arr);

        Iterator it = arr.iterator();

        while (it.hasNext()) {

            Object e = it.next();

            if (e instanceof String) {

                String s = (String) e;

                if (s.contains(s1)) {
                    it.remove();
                }

            }

        }

        System.out.println(arr + " after removing");

    }

}
