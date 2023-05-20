import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingAndDuplicateNo {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(11);

        int[] ans = new int[2];
        ans = missingAndDuplicateNo(l);
        System.out.println("duplicate no = " + ans[0]);
        System.out.println("missing no = " + ans[1]);
    }

    public static int[] missingAndDuplicateNo(List<Integer> l) {

        int[] ans = new int[2];
        int count = 0;

        for (int i = 0; i < l.size(); i++) {

            count = 0;
            int a = l.get(i);

            for (int j = 0; j < l.size(); j++) {

                int b = l.get(j);

                if (a == b) {
                    count++;
                }

            }

            if (count > 1) {
                ans[0] = a;
            }

        }

        Set<Integer> s1 = new HashSet<>();
        s1.addAll(l);

        for (int i = 0; i <= l.size(); i++) {
            if (!s1.contains(i)) {
                ans[1] = i;
            }
        }

        return ans;

    }
}
