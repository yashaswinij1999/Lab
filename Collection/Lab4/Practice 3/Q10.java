import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q10 {

    public static void main(String[] args) {

        Set<Float> s = new HashSet<>();
        s.add(356.8f);
        s.add(1.56f);
        s.add(415.3f);

        Float sum = 0f;

        Iterator<Float> it = s.iterator();

        while (it.hasNext()) {

            sum += it.next();

        }
        System.out.println(sum);

    }

}
