
public class Q19 {

    public static void main(String[] args) {

        System.out.println(isIncreasing(123458));

    }

    public static boolean isIncreasing(int num) {

        int d1, d2;

        while (num > 0) {

            d1 = num % 10;
            num /= 10;
            d2 = num % 10;

            if (d1 < d2) {
                return false;
            }

            num /= 10;

        }

        return true;

    }

}
