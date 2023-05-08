public class Average5 {

    public static void main(String[] args) {

        System.out.println(isIncreasing(1223));

    }

    public static boolean isIncreasing(int n) {

        while (n > 0) {

            int d1 = n % 10;
            n /= 10;

            int d2 = n % 10;

            if (d1 == d2) {
                return false;
            }

            if (d2 > d1) {
                return false;
            }

        }
        return true;

    }
}
