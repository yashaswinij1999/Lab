public class Q7 {

    public static void main(String[] args) {

        fibaconni(5);

    }

    public static void fibaconni(int num) {

        int f = 0;
        int s = 1;
        int r = 0;

        System.out.println(f);
        System.out.println(s);

        // System.out.println(r);

        for (int i = 3; i <= num; i++) {

            r = f + s;
            System.out.println(r);
            f = s;
            s = r;

        }

    }

}