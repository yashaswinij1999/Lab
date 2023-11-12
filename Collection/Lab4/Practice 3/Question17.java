import java.util.ArrayList;
import java.util.List;

public class Question17 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(2);
        l.add(2);
        l.add(2);

        System.out.println(isValueEveryWhere(l, 2));

    }

    public static boolean isValueEveryWhere(List<Integer> l, int value) {

        if (l == null || l.size() < 2) {
            return false;
        }

        for (int i = 0; i < l.size() - 1; i++) {

            int current = l.get(i);
            int next = l.get(i + 1);

            if (current != value && next != value) {

                return false;

            }

        }
        return true;

    }

}
