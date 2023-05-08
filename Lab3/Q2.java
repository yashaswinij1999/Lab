public class Q2 {

    public static void main(String[] args) {

        System.out.println(isEvenOrNot(75));
    }

    public static boolean isEvenOrNot(int a) {

        if (a == 0) {
            return false;
        }

        if (a == 2 || a == 4 || a == 6 || a == 8) {
            return true;
        }

        if (a % 2 == 0) {
            return true;
        }
        return false;

    }

}
