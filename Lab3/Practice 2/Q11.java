public class Q11 {

    public static void main(String[] args) {

        System.out.println("the sum of digits of number " + sumOfDigits(1245));

    }

    public static int sumOfDigits(int num) {

        int r = 0;
        int sum = 0;
        int temp = 0;

        while (num > 0) {

            r = num % 10;
            sum = sum + r;
            num /= 10;

        }
        return sum;

    }

}
