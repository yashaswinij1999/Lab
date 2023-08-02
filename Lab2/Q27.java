public class Q27 {

    public static void main(String[] args) {

        char c = 'a';
        int x = c;

        System.out.println(c + " = " + x);

        for (int i = 1; i <= 25; i++) {

            c++;
            x = c;
            System.out.println(c + " = " + x);

        }
    }

}
