
public class Q13 {

    public static void main(String[] args) {

        int num = 345;
        System.out.println(" the binary representation of number " + num + " is " + intToBinary(num));
        System.out.println(" the octal representation of number " + num + " is " + intToOctal(num));
        System.out.println(" the octal representation of number " + num + " is " + intToHexa(num));
        System.out.println(" the integer representation of binary number " + num + " is " + binToInt(num));
        System.out.println(" the integer representation of oct number " + num + " is " + octToInt(num));
        // binToInt(num);

    }

    public static String intToBinary(int num) {

        String lines = "";
        int r = 0;

        while (num > 0) {
            r = num % 2;
            lines = r + lines;
            num /= 2;
        }

        return lines;

    }

    public static String intToOctal(int num) {

        int r = 0;
        String lines = "";

        while (num > 0) {
            r = num % 8;
            lines = r + lines;
            num /= 8;
        }

        return lines;

    }

    public static String intToHexa(int num) {

        String hexa = Integer.toHexString(num);
        return hexa;

    }

    public static int binToInt(int num) {

        String str = num + "";
        int n = 0;
        int r = 0;
        int result = 0;

        for (int i = 0; i < str.length(); i++) {

            n = n + (int) (Math.pow(2, i) * Integer.parseInt(str.charAt(str.length() - 1 - i) + ""));

        }
        return n;
    }

    public static int octToInt(int num) {

        String str = num + "";
        int n = 0;

        for (int i = 0; i < str.length(); i++) {

            n = n + (int) (Math.pow(8, i) * Integer.parseInt(str.charAt(str.length() - 1 - i) + ""));

        }
        return n;

    }
}
