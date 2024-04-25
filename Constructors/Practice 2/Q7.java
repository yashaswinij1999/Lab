
public class Q7 {

    public static void main(String[] args) {

        System.out.println(dilimiter("abc"));
    }

    public static String dilimiter(String s) {

        String str = "";

        for (int i = 0; i < s.length(); i++) {

            int x = (int) (s.charAt(i));

            str += "." + x;

        }
        return str;

    }

}
