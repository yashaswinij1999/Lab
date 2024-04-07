
public class Q4 {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(58));

    }

    public static boolean isPowerOfTwo(int num) {

        int r = 0;

        while (num > 0) {

            if (num % 2 == 0) {
                num = num / 2;
            }

            if (num == 1) {
                return true;

            }

        }
        return false;

    }

}
