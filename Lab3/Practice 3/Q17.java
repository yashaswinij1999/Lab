
public class Q17 {

    public static void main(String[] args) {

        System.out.println(isSame(211, 1191));
    }

    public static boolean checkTarget(int num, int target) {

        int r = 0;

        while (num > 0) {
            r = num % 10;
            if (r == target) {
                return true;
            }
            num /= 10;

        }
        return false;

    }

    public static boolean isSame(int num1, int num2) {
        int r = 0;
        while (num1 > 0) {
            r = num1 % 10;
            if (!checkTarget(num2, r)) {
                return false;
            }
            num1 /= 10;
        }
        return true;
    }
}
