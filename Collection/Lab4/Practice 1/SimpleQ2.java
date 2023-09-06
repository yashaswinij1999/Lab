public class SimpleQ2 {

    public static void main(String[] args) {

        String word = "mogamboo";

        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);

            if (c == 'o') {
                count++;
            }

        }
        System.out.println(" character = " + 'o' + " " +  " occurs " + count + " times ");

    }

}
