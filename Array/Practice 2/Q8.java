import java.util.Arrays;

public class Q8 {

    public static void main(String[] args) {

        int[] arr1 = { 15, 98, 105, 56, 41, 28 };
        int[] arr2 = { 51, 84, 96, 85, };
        int secondHighestValue = secondHighestValue(arr1, arr2);
        System.out.println("the second highest value in both the arrays = " +
                secondHighestValue);

    }

    public static int secondHighestValue(int[] arr1, int[] arr2) {

        int len = arr1.length + arr2.length;
        int[] res = new int[30];
        int i = 0;
        int result = 0;

        for (int x : arr1) {
            res[i] = x;
            i++;
        }

        for (int x : arr2) {
            res[i] = x;
            i++;
        }

        Arrays.sort(res);

        result = res[res.length - 2];
        return result;
    }

}
