import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q16 {

    public static void main(String[] args) {

        int[] ar = { 1, 1, 2, 3, 3, 4, 4 };
        List<Integer> l = new ArrayList();
        l.add(1);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(3);

        for (int a : l) {
            int count = 0;

            for (int b : l) {
                if (a == b) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(" element " + a + " occurs " + count + " times ");
            }
        }

    }

}
