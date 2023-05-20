public class Q8 {

    public static void main(String[] args) {

        String str = "Good Evening";
        System.out.println(toReverse(str));
    }

    public static String toReverse(String str) {

        String s = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            s = s + " " + str.charAt(i);
        }
        return s;
    }
}
