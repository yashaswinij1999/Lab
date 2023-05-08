public class Q14 {

    public static void main(String[] args) {

        System.out.println("factorialOfNumber = " + factorialOfNumber(3));

    }

    public static int factorialOfNumber(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {

            fact = fact * i;
        }
        return fact;
    }
}