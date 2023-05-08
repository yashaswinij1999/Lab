public class Q3 {

    public static void main(String[] args) {

        System.out.println(isNumberPrime(101));

    }

    public static boolean isNumberPrime(int a) {

        if (a <= 1) {
            return false;
        }

        if (a == 2 || a == 3 || a == 5 || a == 7) {
            return true;
        }

        if (a % 2 == 0) {
            return false;
        }

        for (int i = 1; i <= a; i++) {

            if (a % 3 == 0) {
                return false;
            }
        }
        return true;

    }

}
