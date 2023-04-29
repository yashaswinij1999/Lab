import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SimpleQ10 {

    public static void main(String[] args) {

        Set<Double> s = new HashSet<Double>();
        s.add(12.3);
        s.add(15.48);
        s.add(98.9999);

        // adding the elements using Iterator
        double sum = 0;
        Iterator<Double> it = s.iterator();
        while (it.hasNext()) {
            sum += it.next();
        }
        System.out.println("sum = " + sum);

    }

}
