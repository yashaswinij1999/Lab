
public class Q13e {

    public static void main(String[] args) {

        reverseStr("I Love Java");
        reverseString("Welcome to World of Java");
    }

    public static void reverseStr(String str) {

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(sb.toString());

    }

    public static void reverseString(String str) {

        char[] c = str.toCharArray();
        int len = c.length;
        int pos = (int) (Math.floor(len / 2));

        for (int i = 0; i < pos; i++) {

            c[i] ^= c[c.length - 1 - i];
            c[c.length - i - 1] ^= c[i];
            c[i] ^= c[c.length - 1 - i];
        }
        System.out.println(String.valueOf(c));

    }

}
