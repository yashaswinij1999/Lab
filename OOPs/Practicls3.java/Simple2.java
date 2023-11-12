public class Simple2 {

    public static void main(String[] args) {

        System.out.println(istheNumberOfThree(8));

    }

    public static boolean istheNumberOfThree(int n) {

        while (n % 3 == 0) {
            n /= 3;
        }
        if (n == 1) {
            return true;
        }
        return false;

    }

}
