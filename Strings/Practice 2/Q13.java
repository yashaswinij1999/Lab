public class Q13 {

    public static void main(String[] args) {

        String s1 = "Welcome to the World of Java";
        reverse(s1);
        System.out.println("");
        reverseUsingStringBuilder(s1);
        System.out.println("");
        reverseUsingXor(s1);

    }

    public static void reverse(String s1) {

        for (int i = 0; i < s1.length(); i++) {

            char c = s1.charAt(s1.length() - 1 - i);
            System.out.print(c);

        }

    }

    public static void reverseUsingStringBuilder(String s1) {

        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        String str = sb.reverse().toString();
        System.out.print(str);
    }

    public static void reverseUsingXor(String s1) {

        int length = s1.length();
        int result = (int) (Math.floor(length / 2));
        char[] c = s1.toCharArray();

        for (int i = 0; i < result; i++) {

            c[i] ^= c[c.length - 1 - i];
            c[c.length - 1 - i] ^= c[i];
            c[i] ^= c[c.length - 1 - i];

        }
        System.out.println(c);

    }

}
