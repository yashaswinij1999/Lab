
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

        // System.out.println(arr.remove("keshava"));
        // System.out.println(arr);
        // System.out.println(arr.contains("keshava"));
        
        Iterator it = arr.iterator();
        while (it.hasNext()) {
            Object elem = it.next();

            if (elem instanceof String) {

                String s = (String) elem;
                System.out.println(s);
            }

        }

    }

}
