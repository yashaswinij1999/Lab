
public class Q5 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        add(arr);

    }

    public static void add(int [] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

}
