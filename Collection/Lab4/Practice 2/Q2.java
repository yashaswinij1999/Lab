public class Q2 {

    public static void main(String[] args) {

        String word = "mogamboo";
        char c = 'o';
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            char a = word.charAt(i);

            if (a == c) {
                count++;
            }
        }
        System.out.println("a character " + c + " occurs " + count + " times ");

    }

}
