public class Q12 {

    public static void main(String[] args) {

        String s = "HappyMorning";
        String str = "";

        for (int i = 0; i < s.length(); i++) {

            str = s.charAt(s.length() - 1) + s.substring(1, s.length() - 1) + s.charAt(0);

        }

        System.out.println(str);

    }

}
