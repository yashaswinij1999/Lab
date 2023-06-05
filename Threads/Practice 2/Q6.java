public class Q6 {

    public static void main(String[] args) {

        String s = "The mary had a little lamp";

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c >= 97 && c <= 123 || c >= 65 && c <= 90) {
                count++;
            }
        }

        System.out.println(" no of letters = " + count);

        char c = 'Z';
        int x = (char) c;
        System.out.println(x);

    }

}
