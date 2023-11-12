public class Q4 {

    public static void main(String[] args) {

        System.out.println(occuranceIsThereOrNot(154895556, 11));

    }

    public static boolean occuranceIsThereOrNot(int num, int n) {

        int r = 0;

        while (num > 0) {

            r = num % 10;
            if (r == n) {
                return true;
            }
            num /= 10;

        }
        return false;

    }

}
