public class Q12 {

    public static void main(String[] args) {

        System.out.println("sum =" + isSum(2458));
    }

    public static int isSum(int n) {

        int sum = 0;
        int r = 0;

        while (n > 0) {
            r = n %10;
            sum += r;
            n /= 10;
        }
        return sum;
    }

}
