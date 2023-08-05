public class W2 {

    public static void main(String[] args) {

        System.out.println(powerOfThree(81));

    }

    public static boolean powerOfThree(int num) {

        while (num % 3 == 0) {

            num /= 3;

        }

        if (num == 1) {
            return true;
        }

        return false;

    }

}
