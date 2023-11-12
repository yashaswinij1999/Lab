import java.util.ArrayList;
import java.util.List;

public class Question21 {

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

        int count = 0;
        int a = 0;
        int b = 0;

        int[] arr = new int[2];

        for (int i = 0; i < l.size(); i++) {

            count = 0;
            a = l.get(i);

            for (int j = 0; j < l.size(); j++) {

                b = l.get(j);

                if (a == b) {
                    count++;
                }

            }

            if (count > 1) {

                arr[0] = a;

            }

        }

        for (int i = 1; i < l.size(); i++) {

            if (!l.contains(i)) {
                arr[1] = i;
            }

        }

        System.out.println("missing number :" + arr[1]);
        System.out.println("duplicate number : " + arr[0]);

    }

}
