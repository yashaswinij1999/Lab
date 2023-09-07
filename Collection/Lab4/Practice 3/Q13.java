public class Q13 {

    public static void main(String[] args) {

        float[] f = { 1, 8, 9, 9, 1, 10, 10 };

        System.out.println("is distinct = " + ifTheyAreDistinct(f));

    }

    public static boolean ifTheyAreDistinct(float[] f) {

        boolean isDistinct = true;
        int count = 0;
        for (int i = 0; i < f.length; i++) {

            count = 0;

            for (int j = 0; j < f.length; j++) {

                if (f[i] == f[j]) {
                    count++;
                }

            }

            if (count != 1) {
                return isDistinct = false;

            }

        }

        return isDistinct = true;

    }

}
