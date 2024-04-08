
public class Q13 {

    public static void main(String[] args) {

        int num = 16;
        System.out.println(" the binary representation of number " + num + " is " + intToBinary(num));
        System.out.println(" the octal representation of number " + num + " is " + intToOctal(num));

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
}
