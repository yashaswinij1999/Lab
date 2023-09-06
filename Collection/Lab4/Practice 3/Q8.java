import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q8 {

    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        s.add("sharu");
        s.add("ramu");
        s.add("sheeela");
        s.add("om");

        Iterator<String> it = s.iterator();

        while (it.hasNext()) {

            String str = it.next();
            System.out.println(str);

        }

    }

}
