import java.util.ArrayList;
import java.util.List;

public class subArray {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(9);
        l.add(1);
        l.add(8);
        l.add(-4);
        l.add(2);
        l.add(-6);
        l.add(10);

        System.out.println("max sum in subarroy =" + findMaxSumInSubArray(l));
        System.out.println(Integer.MIN_VALUE);

    }

    public static int findMaxSumInSubArray(List<Integer> l) {

        int sum = Integer.MIN_VALUE;
        int maxSum = 0;

        for (int a : l) {

            if (sum < 0) {
                sum = a;
            } else {
                sum = sum + a;
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;

    }

}
