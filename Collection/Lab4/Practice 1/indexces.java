public class Q9 {

    public static int[] findMinMax(int[] arr, int n) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < n; i++) {

            if (arr[i] < min) {
                min = arr[i];
            } else {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }

        int[] ans = new int[2];
        ans[0] = min;
        ans[1] = max;
        return ans;

    }

    public static void main(String[] args) {

        int[] arr = { 5, 14, 5, 2, 4, 45 };
        int length = arr.length;
        int[] ans = findMinMax(arr, length);
        System.out.println(" smallest no = " + ans[0]);
        System.out.println(" largest no = " + ans[1]);

    }
}