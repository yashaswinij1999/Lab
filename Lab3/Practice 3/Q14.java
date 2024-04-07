
public class Q14 {

    public static void main(String[] args) {

        System.out.println(getFactorialOfNumber(5));

    }

    public static int getFactorialOfNumber(int num) {

        int fact = 1;

        for (int i = 1; i <= num; i++) {

            fact = fact * i;

        }
        return fact;

    }

}
