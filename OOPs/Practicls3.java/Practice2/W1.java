public class W1 {

    public static void main(String[] args) {

        System.out.println(oddNotDivisibleBy3(7));

    }

    public static boolean oddNotDivisibleBy3(int num) {

        if (num <= 1) {
            return false;
        }

        if (num % 2 == 0) {
            return false;
        }

        if (num == 5 || num == 7) {
            return true;
        }

        if (num % 2 != 0) {

            if (num % 3 != 0) {
                return true;
            }

        }
        return false;
    }
}
