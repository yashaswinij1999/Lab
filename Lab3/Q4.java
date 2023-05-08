public class Q4 {

    public static void main(String[] args) {

        System.out.println(" isPerfectSquare = " + isPerfectSquare(10));

    }

    public static boolean isPerfectSquare(int n) {

        if (n == 0) {
            return false;
        }
        if (n == 1 || n == 4 || n == 9) {
            return true;
        }

        for (int i = 1; i <= n; i++) {

            if (i * i == n) {
                return true;
            } else {
                if (i * i > n)
                    ;

            }
        }
        return false;
    }
}
