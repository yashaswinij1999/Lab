import java.util.Arrays;

public class Q8 {

    public static void main(String[] args) {

        int[] ar1 = { 1, 87, 96, 84, 52 };
        int[] ar2 = { 8, 98, 85, 52, 14 };
        int secondAvg = findSecondAvg(ar1, ar2);
        System.out.println("secong avg = " + secondAvg);

    }

    public static int findSecondAvg(int[] ar1, int[] ar2) {

        int len = ar1.length + ar2.length;
        int[] res = new int[len];
        int i = 0;

        for (int x : ar1) {

            res[i] = x;
            i++;

        }

        for (int x : ar2) {

            res[i] = x;
            i++;

        }

        Arrays.sort(res);
        return res[len - 2];

    }
}