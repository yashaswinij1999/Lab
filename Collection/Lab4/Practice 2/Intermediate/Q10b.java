import java.util.ArrayList;
import java.util.List;

public class Q10b {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(23);
        l.add(25);
        l.add(1);
        l.add(15);
        System.out.println("l == " + l);

        while (l.size() != 0) {

            int a = (int) (Math.random() * l.size());
            l.remove(a);
        }
        System.out.println("l == " + l);
    }

}
