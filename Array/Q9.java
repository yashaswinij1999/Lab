public class Q9 {

    public static void main(String[] args) {

        int[] ar1 = { 1, 2, 2, 8, 1 };
        int[] ar2 = { 1, 9, 9, 7, 7 };
        findUniqueElement(ar1, ar2);

    }

    public static void findUniqueElement(int[] ar1, int[] ar2) {

        int len = ar1.length + ar2.length;
        int a = 0;
        int b = 0;
        int count = 0;
        int[] newArr = new int[len];
        int[] result = new int[ar1.length];

        for (int i = 0; i < ar1.length; i++) {

            newArr[a] = ar1[i];
            a++;

        }

        for (int i = 0; i < ar2.length; i++) {

            newArr[a] = ar2[i];
            a++;

        }

        for (int i = 0; i < newArr.length - 1; i++) {

            for (int j = 0; j < newArr.length - 1; j++) {
                if (newArr[i] == newArr[j]) {
                    count++;
                }
            }

            System.out.println(newArr[i] + " ocurrs " + count + " times ");

            if (count == 1) {
                result[b] = newArr[i];
                b++;
            }
            count = 0;
        }

        System.out.println("unique element = " + result[0]);
    }

}
