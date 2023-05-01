import java.util.ArrayList;
import java.util.List;

public class Q10 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(11);
        l.add(145);
        l.add(85);
        l.add(50);
        l.add(47);
        l.add(8);
        l.add(7);
        l.add(6);
        l.add(5);

        while (l.size() > 0) {

            int i = (int) (Math.random() * l.size());
            System.out.println(l.remove(i));

        }

    }

}
