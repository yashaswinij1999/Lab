
public class Q27 {

    public static void main(String[] args) {

        char c = 'a';
        int i = c;

        for (int k = 1; k <= 25; k++) {

            c++;
            i = c;
            System.out.println(i+ "--->" + c);

        }

    }

}
