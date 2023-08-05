public class Q2 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 9; i > 0; i--) {

            arr[i] = i + 1;

        }

        for (int i = 0; i < arr.length; i++) {

            // System.err.println(arr[i]);

        }

        for (int x : arr) {
            System.out.println(x);
        }
    }

}
