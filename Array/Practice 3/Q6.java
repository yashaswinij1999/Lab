
public class Q6 {

    public static void main(String[] args) {

        int[] arr1 = {8, 9, 6, 5};
        int[] arr2 = {2, 4, 6, 10};
        maxValue(arr1, arr2);

    }

    public static void maxValue(int[] arr1, int[] arr2) {

        int max = 0;

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] > max) {
                max = arr1[i];
            }

        }

        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] > max) {
                max = arr2[i];
            }

        }
        System.out.println(max);

    }
}
