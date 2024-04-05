
public class Testloop {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 11 != 0) {
                System.out.print(" " + i);
            } else {
                System.out.println();
                System.out.print(" " + i);
            }

        }
        System.out.println();

    }

}
