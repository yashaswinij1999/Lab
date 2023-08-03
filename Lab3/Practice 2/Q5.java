public class Q5 {

    public static void main(String[] args) {

        System.out.println(powerOf2(21));

    }

    public static boolean powerOf2(int num) {

        while (num % 2 == 0) {

            num /= 2;

        }

        if (num == 1) {
            return true;
        } else {
            return false;
        }

    }

}
