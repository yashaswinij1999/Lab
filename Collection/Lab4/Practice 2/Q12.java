public class Q12 {

    public static void main(String[] args) {

        float[] arr = { 01f, 02f, 03f, 01f,025f, 06 };
        System.out.println("isDistinct = " + isDistinct(arr));

    }

    public static boolean isDistinct(float[] arr) {

        boolean isDistinct = true;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (i != j && arr[i] == arr[j]) {
                    isDistinct = false;
                }
            }
        }
        return isDistinct;
    }
}
