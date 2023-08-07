public class toInterChange {

    public static void main(String[] args) {

        String s = "rAmA123";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (Character.isLowerCase(c)) {

                sb.append(Character.toUpperCase(c));

            } else {

                sb.append(Character.toLowerCase(c));

            }

        }

        System.out.println(sb.toString());

    }

}
