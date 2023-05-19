import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q10 {

    public static void main(String[] args) {

        Set<Float> s = new HashSet<>();
        s.add(102.00f);
        s.add(14.15f);
        s.add(15.41f);

        float sum = 0.0f;

        Iterator<Float> it = s.iterator();

        while (it.hasNext()) {
            Float f = it.next();
            sum += f;
        }
        System.out.println("sum ==" + sum);

    }
}
