
public class Q2 {

    public static void main(String[] args) {

        System.out.println(isPrime(17));

    }

    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        if (num == 2 || num == 3 || num == 5 || num == 7) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

}
