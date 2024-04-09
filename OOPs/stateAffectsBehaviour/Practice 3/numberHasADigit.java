
public class numberHasADigit {

    public static void main(String[] args) {

        System.out.println(numberHasADigit(12458, 2));

    }

    public static boolean numberHasADigit(int num, int digit) {

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
