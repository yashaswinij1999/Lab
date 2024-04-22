
public class Q13d {

    public static void main(String[] args) {

        System.out.println(reverse("I love java"));

    }

    public static String reverse(String str) {

        String s = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            s = s + " " + str.charAt(i);
        }
        return s;

    }
}
