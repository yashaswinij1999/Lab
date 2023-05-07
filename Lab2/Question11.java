public class Question11 {

    public static void main(String[] args) {

        int k = 1;
        char c = (char) k;
        System.out.println(c);

        for (int i = 1; i <= 65535; i++) {

            if (i % 5 == 0) {
                System.out.print(" " + i);

            } else {
                c = (char) i;
                System.out.print(" " + c);
            }
        }
        System.out.println(" ");

    }

}
