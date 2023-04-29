import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SimpleQ8 {

    public static void main(String[] args) {

        Set<String> s = new HashSet<String>();
        s.add("rama");
        s.add("seetha");
        s.add("arjuna");
        s.add("shiva");
        s.add("parvathi");
        s.add("brama");

        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
