public class W3 {

    public static void main(String[] args) {

        addReverseDigits(1234);

    }

    public static void addReverseDigits(int num) {

        int r = 0;
        int a = 0;
        int sum = 0;
        int n = num;

        while (num > 0) {

            r = num % 10;
            a = a * 10 + r;
            num /= 10;

        }

        sum = n + a;
        System.out.println("sum = " + sum);

    }

}
