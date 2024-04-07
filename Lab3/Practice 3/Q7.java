
public class Q7 {

    public static void main(String[] args) {

        generateNfibnocci(5);

    }

    public static void generateNfibnocci(int n) {
        int f = 0;
        int s = 1;

        System.out.println(f);
        System.out.println(s);

        for (int i = 3; i <= n; i++) {

            int r = f + s;
            System.out.println(r);
            f = s;
            s = r;

        }

    }

}
