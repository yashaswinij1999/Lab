import java.util.ArrayList;
import java.util.List;

public class Question11 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(19);
        l.add(74);
        l.add(96);
        l.add(78);
        System.out.println(l);

        while (l.size() > 0) {

            int random = (int) (Math.random() * l.size());
            l.remove(random);

        }
        System.out.println(l);

    }

}
