
public class Q13 {

    public static void main(String[] args) {

        int num = 10;
        System.out.println(" the binary representation of number " + num + " is " + intToBinary(num));

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
}
