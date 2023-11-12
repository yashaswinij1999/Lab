import java.util.ArrayList;
import java.util.List;

public class Question19 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(0, 1);
        l.add(1, 4);
        l.add(2, 6);
        l.add(3, 19);

        int target = 6;

        System.out.println(findIndexOf2Number(l, target));

    }

    public static boolean findIndexOf2Number(List<Integer> l, int target) {

        for (int i = 0; i < l.size() - 1; i++) {

            if (l.get(i) + l.get(i + 1) == target) {

                System.out.println(" index1 = " + i + " index2 = " + (i + 1));
                return true;

            }

        }
        return false;

    }

}
