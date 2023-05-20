import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class Indexces {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(9);
        l.add(7);
        l.add(1);
        l.add(14);
        int target = 10;

        findIndexces(l, target);

    }

    public static void findIndexces(List<Integer> l, int target) {

        for (int i = 0; i < l.size(); i++) {

            for (int j = 0; j < l.size(); j++) {

                if (l.get(i) + l.get(j) == target) {
                    System.out.println(i);
                    System.out.println(j);
                    return;
                }
            }
        }

    }

}
