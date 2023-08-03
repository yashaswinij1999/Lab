public class Q9 {

    public static void main(String[] args) {

        System.out.println("the lcm of 2 numbers " + lcm(4, 9));

    }

    public static int lcm(int a, int b) {

        if (a == 0 || b == 0) {
            return 0;
        }

        int d = a > b ? a : b;
        while (true) {

            if (d % a == 0 || d % b == 0) {
                return d;
            }
            d++;

        }

    }

}
