
public class Q2 {

    public static void main(String[] args) {

        String s = "ramaramarai";
        int count = 0;
        char c = 'r';

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == c) {
                count++;

            }

        }
        System.out.println("the character " + c + " occurs " + count + " no of times");

    }
}
