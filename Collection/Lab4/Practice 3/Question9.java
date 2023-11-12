import java.util.Arrays;

public class Question9 {

    public static void main(String[] args) {

        int[] arr = { 12, 9, 66, 89, 14 };
        int smallest = arr[0];
        int largest = arr[0];

        for (int i : arr) {

            if (i < smallest) {

                smallest = i;

            }
            if (i > largest) {

                largest = i;

            }
        }

        System.out.println("the largest number : " + largest + " smallest number : " + smallest
                + " without using library methods");

        Arrays.sort(arr);
        smallest = arr[0];
        largest = arr[arr.length - 1];

        System.out.println("the largest number : " + largest + " smallest number : " + smallest
                + " with using library methods");

    }

}
