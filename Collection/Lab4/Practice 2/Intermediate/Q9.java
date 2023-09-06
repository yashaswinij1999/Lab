public class Q9 {

    public static void main(String[] args) {

        int[] arr = { 8, 9, 5, 7, 6 };

        int[] result = findMinAndMax(arr);
        System.out.println("int largest No = " + result[0]);
        System.out.println("int smallest No = " + result[1]);

    }

    public static int[] findMinAndMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            } else {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        result[0] = max;
        result[1] = min;
        return result;
    }
}
