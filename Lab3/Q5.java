public class Q5 {

    public static void main(String[] args) {

        System.out.println(" isPowerOfTwo = " + isPowerOfTwo(512));

    }

    public static boolean isPowerOfTwo(int n) { 

        if (n <= 1) {
            return false;
        }

        while (n % 2 == 0) {

            n = n / 2;

        }

        if (n == 1) {
            return true;
        }
        return false;
    }
}
