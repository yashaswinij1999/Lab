public class Q3 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {

            arr[i] = (int) (Math.random() * 100);

        }

        for (int a : arr) {
            System.out.println(a);
        }

    }

}
