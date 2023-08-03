public class Q19 {

    public static void main(String[] args) {

        System.out.println(" is the given number is in increasing order " +
                increasingOrder(120));
        int c = 0;

        for (int i = 0; i <= 10000; i++) {

            if (increasingOrder(i)) {
                c++;
                System.out.println(" i = " + i);

            }

        }
        System.out.println(" the total number " + c);

    }

    public static boolean increasingOrder(int num) {

        boolean isIncreasing = true;

        while (num > 0) {

            int d1 = num % 10;
            num /= 10;

            int d2 = num % 10;

            if (d2 > d1) {
                isIncreasing = false;
                break;
            }

        }
        return isIncreasing;

    }

}
