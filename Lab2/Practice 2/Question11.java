public class Question11 {

    public static void main(String[] args) {

        int x = 'a';

        for (int i = 1; i <= 65535; i++) {

            if (i % 5 == 0) {
                System.out.print(" ");
            } else {
                System.out.print(" " + (char) i);
            }

        }
        System.out.println("");
    }

}
