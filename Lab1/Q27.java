public class Q27 {

    public static void main(String[] args) {

        char c = 'a';
        int i = c;
        System.out.println(i + " " + c);

        for (int j = 1; j <= 25; j++) {

            c++;
            i = c;
            System.out.println(i + " " + c);
        }
    }

}
