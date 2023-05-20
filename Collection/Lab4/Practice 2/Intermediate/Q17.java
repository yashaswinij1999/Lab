import java.util.ArrayList;
import java.util.List;

public class Q17 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(14);
        l.add(9);
        l.add(23);
        l.add(-1);
        l.add(6);
        System.out.println("largestSum = " + findLargestSum(l));

    }

    public static int findLargestSum(List<Integer> l) {

        int sum = Integer.MIN_VALUE;
        int maxSum = 0;

        for (int a : l) {

            if (sum < 0) {
                sum = a;
            } else {
                sum = sum + a;
            }
        }
        maxSum = Math.max(maxSum, sum);

        return maxSum;
    }
}
