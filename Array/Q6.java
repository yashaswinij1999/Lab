public class Q6 {

    public static void main(String[] args) {

        int[] arr1 = { 1,8,401,89,14};
        int[] arr2 = { 54, 47, 96, 45, 47 };

        int biggestNumber = findMax(arr1, arr2);
        System.out.println(" biggest number = " + biggestNumber);

    }

    public static int findMax(int[] arr1, int[] arr2) {

        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < arr1.length - 1; i++) {

            int a = arr1[i];

            if (a > max1) {
                max1 = a;
            }

        }

        for (int i = 0; i < arr2.length - 1; i++) {

            int b = arr2[i];

            if (b > max1) {
                max1 = b;
            }

        }

        if (max1 > max2) {
            return max1;
        }
        return max2;

    }

}
