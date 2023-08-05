public class Q7 {

    public static void main(String[] args) {

        int[] arr1 = { 5, 6, 9, 8 };
        int[] arr2 = { 1, 2 };
        double avg = findAvgInBothArrays(arr1, arr2);
        System.out.println("the avg value in both the arrays = " + avg);

    }

    public static double findAvgInBothArrays(int[] arr1, int[] arr2) {

        double sum1 = 0;
        double sum2 = 0;
        double avg = 0.0;

        for (int i = 0; i < arr1.length; i++) {

            sum1 += arr1[i];

        }

        for (int i = 0; i < arr2.length; i++) {

            sum2 += arr2[i];

        }

        avg = (sum1 + sum2) / (arr1.length + arr2.length);
        return avg;

    }

}
