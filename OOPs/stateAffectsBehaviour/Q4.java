public class Q4 {

    public static void main(String[] args) {

        System.out.println(" givenNumberHasGivenDigit = " + givenNumberHasGivenDigit(1245, 10));

    }

    public static boolean givenNumberHasGivenDigit(int num, int digit) {

        int r = 0;

        while (num > 0) {

            r = num % 10;

            if (r == digit) {
                return true;
            }
            num /= 10;
        }
        return false;
    }

}
