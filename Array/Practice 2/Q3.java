public class Q3 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 1; i < 10; i++) {

            int x = (int) (Math.random() * 100);
            arr[i] = x;

        }

        for (int c : arr) {
            System.out.println(c);
        }

    }

}
