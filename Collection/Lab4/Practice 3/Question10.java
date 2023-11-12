import java.util.ArrayList;
import java.util.List;

public class Question10 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(2);

        boolean result = toFindDistinctEvenElements(l);

        if (result) {

            System.out.println("there are pair of distinct elements whose product is even");

        } else {

            System.out.println("there are no distinct even pair of elements");
        }
    }

    public static boolean toFindDistinctEvenElements(List<Integer> l) {

        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < l.size(); i++) {

            num1 = l.get(i);

            for (int j = 0; j < l.size(); j++) {

                num2 = l.get(j);

                if ((num1 * num2) % 2 == 0) {
                    return true;

                }
            }

        }
        return false;

    }

}
