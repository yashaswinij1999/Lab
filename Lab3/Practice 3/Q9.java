
public class Q9 {

    public static void main(String[] args) {

        System.out.println(findGCM(8, 16));

    }

    public static int findGCM(int a, int b) {

        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        if (a == b && b == 0) {
            return 0;
        }

        int d = a > b ? a : b;
        while (d > 0) {

            if (a % d == 0 && b % d == 0) {
                return d;
            }
            d--;

        }

        return 0;
    }

}
