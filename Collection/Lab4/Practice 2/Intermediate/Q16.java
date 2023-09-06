import java.util.ArrayList;
import java.util.List;

public class Q16 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(1);
        l.add(2);
        l.add(3);

        int val = 1;
        System.out.println(isValueEveryWhere(l, val));
    }

    public static boolean isValueEveryWhere(List<Integer> l, int val) {

        for (int i = 0; i < l.size() -1; i++) {

            if (l.get(i) != val && l.get(i + 1) != val) {
                return false;
            }
        }
        return true;
    }

}
