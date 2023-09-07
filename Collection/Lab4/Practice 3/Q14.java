import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q14 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(1);
        l.add(3);
        l.add(2);
        l.add(1);

        System.out.println("after removing duplicate elements : " + removeDuplicateElements(l));

    }

    public static List removeDuplicateElements(List<Integer> l) {

        List<Integer> l1 = new ArrayList<>();

        for (Integer i : l) {

            if (!l1.contains(i)) {
                l1.add(i);
            }

        }
        return l1;

    }

}
