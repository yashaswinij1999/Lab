public class Q9 {

    public static void main(String[] args) {

        System.out.println("gcd of 2 numbers = " + isGCD(16,12));

    }

    public static int isGCD(int a, int b) {

        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return b;
        }

        int d = a < b ? a : b;

        while (true) {

            if (a % d == 0 && b % d == 0) {
                return d;
            }
            d--;
        }

    }

}
