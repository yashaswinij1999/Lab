
public class Q7 {

    public static void main(String[] args) {

        int[] arr1 = {8, 9, 6, 5};
        int[] arr2 = {2, 4, 6, 10};
        averageVal(arr1, arr2);

    }

    public static void averageVal(int[] arr1, int[] arr2) {

        int sum = 0;
        int length = arr1.length + arr2.length;

        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }

        double avg = (double) (sum) / (length);
        System.out.println(avg);
    }
}
