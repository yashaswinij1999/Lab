public class Q13 {

    public static void main(String[] args) {

        int num = 6;
        String s = "110";
        System.out.println("the number " + num + " in binary converstion = " + intToBin(num));
        System.out.println("the number " + num + " in octal converstion = " + intToOct(num));
        System.out.println("the number in binary representaion  = " + intToBin(num) + " in base10 = " + binToInt(s));
        System.out.println("the number in binary representaion  = " + intToBin(num) + " in base10 = " + octToInt(s));

    }

    public static String intToBin(int num) {

        String s = "";

        while (num > 0) {

            s = (num % 2) + s;
            num /= 2;

        }
        return s;

    }

    public static String intToOct(int num) {

        String s = "";

        while (num > 0) {

            s = (num % 8) + s;
            num /= 8;

        }
        return s;

    }

    public static int binToInt(String s) {

        int n = 0;

        for (int i = 0; i < s.length(); i++) {

            n = n + (int) (Math.pow(2, i)) * Integer.parseInt(s.charAt(s.length() - 1 - i) + "");

        }
        return n;

    }

    public static int octToInt(String s) {

        int n = 0;

        for (int i = 0; i < s.length(); i++) {

            n = n + (int) (Math.pow(8, i)) * Integer.parseInt(s.charAt(s.length() - 1 - i) + "");

        }
        return n;

    }

}
