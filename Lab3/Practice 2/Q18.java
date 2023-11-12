public class Q18 {

    public static void main(String[] args) {

        System.out.println("the given number occurs " + noOfOccurance(5124441, 4) + " times ");
        System.out.println("is 2 numbers have same digits " + sameDigits(121, 112));

    }

    public static boolean sameDigits(int a, int b) {

        int k = a;
        int d = 0;

        while (k > 0) {

            d = k % 10;
            if (noOfOccurance(a, d) != noOfOccurance(b, d)) {
                return false;
            }
            k /= 10;

        }
        return true;

    }

    public static int noOfOccurance(int num, int n) {

        int r = 0;
        int count = 0;

        while (num > 0) {

            r = num % 10;

            if (r == n) {
                count++;
            }
            num = num /= 10;

        }
        return count;

    }

}
