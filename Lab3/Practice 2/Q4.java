public class Q4 {

    public static void main(String[] args) {

        System.out.println(isPerfectSquare(25));
    }

    public static boolean isPerfectSquare(int num) {

        if (num == 0) {
            return false;
        }

        if (num == 1 || num == 4 || num == 9) {
            return true;
        }

        for (int i = 1; i <= num; i++) {

            if (i * i == num) {
                return true;
            } else {

                if (i * i > num) {

                }
            }

        }
        return false;
    }

}
