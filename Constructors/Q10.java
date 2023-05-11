public class Q10 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String s = "aBc%12x";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        String str = sb.toString();
        System.out.println(str);
    }

}
