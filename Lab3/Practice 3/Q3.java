
public class Q3 {

    public static void main(String[] args) {

        System.out.println(isPerfectSquare(6));

    }

    public static boolean isPerfectSquare(int num) {

        for (int i = 1; i <= num; i++) {

            if (i * i == num) {
                return true;
            }

        }
        return false;

    }

}
