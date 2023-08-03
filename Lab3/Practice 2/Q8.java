public class Q8 {

    public static void main(String[] args) {

        System.out.println("the gcd of  2 number = " + GCD(15, 6));

    }

    public static int GCD(int a, int b) {

        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
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
