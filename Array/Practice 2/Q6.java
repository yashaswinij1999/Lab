public class Q6 {

    public static void main(String[] args) {

        int[] arr1 = { 2, 6, 8 };
        int[] arr2 = { 9, 55, 40 };
        int value = maxInBothArroys(arr1, arr2);
        System.out.println("the max value in the both the arrays = " + value);

    }

    public static int maxInBothArroys(int[] arr1, int[] arr2) {

        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < arr1.length - 1; i++) {

            if (arr1[i] > arr1[i + 1]) {

                max1 = arr1[i];
            } else {

                max1 = arr1[i + 1];

            }

        }

        for (int i = 0; i < arr2.length - 1; i++) {

            if (arr2[i] > arr2[i + 1]) {

                max2 = arr2[i];
            } else {

                max2 = arr2[i + 1];

            }

        }

        if (max1 > max2) {
            return max1;
        } else {
            return max2;
        }
    }

}
