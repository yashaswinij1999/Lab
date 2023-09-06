import java.util.ArrayList;
import java.util.List;

public class SimpleQ14 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(22);
        l.add(14);
        l.add(2);
        l.add(22);
        l.add(14);
        l.add(5);
        l.add(5);

        for (int a : l) {

            int count = 0;
            for (int b : l) {

                if (a == b) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("the element " + a + " appears " + count);
            }
        }

    }

}
