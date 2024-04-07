
public class Q14 {

    public static void main(String[] args) {

        getFactorialOfNumber(5);

    }

    public static int getFactorialOfNumber(int num) {

        int fact = 1;

        for (int i = num; i > 0; i++) {

            fact = fact * i;

        }
        return  fact;

    }

}
