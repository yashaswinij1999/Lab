
import java.lang.reflect.Array;
import java.util.Arrays;

public class Q8 {

    public static void main(String[] args) {
        int[] arr1 = {8, 9, 6, 5};
        int[] arr2 = {2, 4, 6, 10};
        secondHighest(arr1, arr2);
    }

    public static void secondHighest(int[] arr1, int[] arr2) {

        int len = arr1.length + arr2.length;
        int[] arr3 = new int[len];
        int i = 0;

        for (int x : arr1) {
            arr3[i] = x;
            i++;
        }
        for (int x : arr2) {
            arr3[i] = x;
            i++;
        }

        Arrays.sort(arr3);
        System.out.println(arr3[arr3.length-2]);
    }
}
