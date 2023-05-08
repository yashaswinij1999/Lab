public class Q13 {

    public static void main(String[] args) {

        int n = 18;
        System.out.println(" binary representaion of number " + n + " = " + binToInt(n));
        System.out.println(" octal representaion of number " + n + " = " + octToInt(n));
        System.out.println(" hexa representaion of number " + n + " = " + hexaToInt(n));

    }

    public static String binToInt(int n) {

        String s = "";

        while (n > 0) {
            s = n % 2 + s;
            n /= 2;
        }
        return s;
    }

    public static String octToInt(int n) {

        String s = "";

        while (n > 0) {
            s = n % 8 + s;
            n /= 8;
        }
        return s;
    }

    public static String hexaToInt(int n) {

        String s = "";

        while (n > 0) {

            int d = n % 16;

            if (d <= 9) {
                s = d + s;
            } else {
                s = (char) (87 + d) + s;

            }
            n /= 16;
        }
        return s;
    }
}
