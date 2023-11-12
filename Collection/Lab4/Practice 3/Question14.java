import java.util.ArrayList;
import java.util.List;

public class Question14 {

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();

        l.add(2);
        l.add(4);
        l.add(6);

        System.out.println(splitIntoTwoEqualParts(l));

    }

    public static boolean splitIntoTwoEqualParts(List<Integer> l) {

        int TotalSum = 0;

        if (l == null || l.size() < 2) {
            return false;
        }

        for (int i : l) {

            TotalSum += i;

        }

        if (TotalSum % 2 != 0) {
            return false;
        }

        int halfSum = TotalSum / 2;
        int currentSum = 0;

        for (int j : l) {

            currentSum += j;

            if (currentSum == halfSum) {
                return true;
            }

        }
        return false;

    }

}
