public class Q5 {

    public static void main(String[] args) {

        int[] arr = { 5, 9, 12 };
        System.out.println(add(arr));

    }

    public static int add(int[] arr) {

        int sum = 0;

        for (int x : arr) {

            sum = sum + x;

        }
        return sum;

    }

}
