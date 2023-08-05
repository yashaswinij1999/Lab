public class Q1 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {

            arr[i] = i;

        }

        // for (int i = 0; i < arr.length; i++) {

        // System.out.println(arr[i]);

        // }

        int[] arr2 = { 10, 20, 30, 40 };
        for (int x : arr2) {
            System.out.println(x);
        }
    }

}