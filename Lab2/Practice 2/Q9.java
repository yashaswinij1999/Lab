
public class Q9 {

    public static void main(String[] args) {

        pattern(4);

    }

    public static void pattern(int num) {

        for (int i = num; i >= 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }

}
