public class Q7 {

    public static void main(String[] args) {

        double[] arr1 = { 1, 2, 3, 1, 2, 3 };
        double[] arr2 = { 2, 4 };
        double avg = averageOf2Arrays(arr1, arr2);
        System.out.println("average = " + avg);
    }

    public static double averageOf2Arrays(double[] arr1, double arr2[]) {

        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < arr1.length; i++) {

            sum1 += arr1[i];

        }

        for (int i = 0; i < arr2.length; i++) {

            sum2 += arr2[i];

        }

        return (sum1 + sum2) / (arr1.length + arr2.length);

    }

}
