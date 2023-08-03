public class Q14 {

    public static void main(String[] args) {

        int num = 5;
        System.out.println("the factorial of the number " + factorial(num));

    }

    public static int factorial(int num) {

        int fact = 1;

        for (int i = 1; i <= num; i++) {

            fact = fact * i;

        }
        return fact;

    }

}
