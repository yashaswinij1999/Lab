public class Average3 {

    public static void main(String[] args) {

        System.out.println(reverseSum(121));

    }

    public static int reverseSum(int n) {

        int a = 0;
        int sum = n;
        int r = 0;

        while (n > 0) {

            r = n % 10;
            a = (a * 10) + r;
            n /= 10;

        }
        sum = a + sum;
        return sum;
    }

}
