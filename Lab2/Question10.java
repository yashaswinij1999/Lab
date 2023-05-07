public class Question10 {

    public static void main(String[] args) {

        int h = 5;

        for (int i = 1; i <= h; i++) {

            for (int j = h - 1; j >= i; j--) {

                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print(" *");

            }
            System.out.println("");
        }

    }

}
