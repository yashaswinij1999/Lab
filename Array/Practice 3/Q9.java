
public class Q9 {

    public static void main(String[] args) {

        int[] arr1 = {8, 6, 6, 5, 8};
        int[] arr2 = {2, 4, 6, 10, 10,};
        unique(arr1, arr2);

    }

    public static void unique(int[] arr1, int[] arr2) {

        int count = 0;
        int a = 0;
        int b = 0;
        int len = arr1.length + arr2.length;
        int[] unique = new int[len];
        int[] arr3 = new int[len];

        for (int i = 0; i < arr1.length; i++) {
            arr3[a] = arr1[i];
            a++;

        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[a] = arr2[i];
            a++;

        }
        for (int i = 0; i < arr3.length; i++) {

            count = 0;

            for (int j = 0; j < arr3.length; j++) {

                if (arr3[i] == arr3[j]) {
                    count++;
                }

            }
            if (count <= 1) {
                unique[b] = arr3[i];
                b++;
            }

        }

        for (int x : unique) {
            System.out.println(x);
        }

    }
}
