
public class Q12 {

    public static void main(String[] args) {

        System.out.println(getSum(1245));

    }

    public static int getSum(int num) {

        int sum = 0;
        int r = 0;

        while (num > 0) {

            r = num % 10;
            sum = sum + r;
            num /= 10;

        }
        return sum;

    }

}
