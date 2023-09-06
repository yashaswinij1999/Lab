import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q9 {

    public static void main(String[] args) {

        String st = "";

        Set<String> s = new HashSet<>();
        s.add("sharu");
        s.add("ramu");
        s.add("sheeela");
        s.add("om");

        Iterator<String> it = s.iterator();

        while (it.hasNext()) {

            String str = it.next();
            st = st + " " + str;

        }
        System.out.println(st);

    }

}
