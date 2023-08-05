public class W5 {

    public static void main(String[] args) {

        System.out.println(isIncreasing(1010));

    }

    public static boolean isIncreasing(int num) {

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
