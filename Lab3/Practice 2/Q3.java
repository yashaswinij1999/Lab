public class Q3 {

    public static void main(String[] args) {

        System.out.println(isPrime(667123));

    }

    public static boolean isPrime(int num) {

        if (num == 0 || num == 1) {
            return false;
        }

        if (num == 2 || num == 3 || num == 5 || num == 7) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= (long) (Math.sqrt(num) + 1); i += 2) {

            if (num % i == 0) {
                return false;
            }

        }
        return true;

    }

}
