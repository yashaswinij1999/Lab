public class Q9 {

    public static void main(String[] args) {

        int[] arr1 = { 5, 5, 8, 4, 1, 2, 6 };
        int[] arr2 = { 5, 5, 8, 9, 8, 4 };
        uniqueValue(arr1, arr2);

    }

    public static void uniqueValue(int[] arr1, int[] arr2) {

        int a = 0;
        int b = 0;
        int len = arr1.length + arr2.length;
        int[] arr = new int[len];
        int[] result = new int[arr1.length];
        int count = 0;

        for (int x : arr1) {
            arr[a] = x;
            a++;
        }

        for (int x : arr2) {
            arr[a] = x;
            a++;
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }

            }

            if (count == 1) {
                result[b] = arr[i];
                b++;
            }
            count = 0;

        }

        for (int m : result) {
            System.out.println(m);
        }

    }

}
