public class Q13a {

    public static void main(String[] args) {

        String str = "Welcome to the World of Java";
        System.out.println(" using concat by reading each char from end = " + reversing(str));
        System.out.println(" using StringBuilder class = " + toReverse(str));
        System.out.println(" using using xor = " + reverse(str));
    }

    public static String reversing(String str) {

        String s1 = "";

        for (int i = 0; i < str.length(); i++) {

            s1 = s1 + str.charAt(str.length() - 1 - i);
        }
        return s1;
    }

    public static String toReverse(String str) {

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String s2 = sb.reverse().toString();
        return s2;

    }

    public static String reverse(String str) {

        char[] c = str.toCharArray();
        int len = c.length;
        int pos = (int) (Math.floor(c.length / 2));

        for (int i = 0; i < pos; i++) {

            c[i] ^= c[c.length - 1 - i];
            c[c.length - i - 1] ^= c[i];
            c[i] ^= c[c.length - 1 - i];
        }
        return String.valueOf(c);
    }
}
