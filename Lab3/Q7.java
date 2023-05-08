public class Q7 {

    public static void main(String[] args) {

        isfibonacci(8);
    }

    public static void isfibonacci(int n) {

        int f = 0;
        int s = 1;

        System.out.println("f = " + f);
        System.out.println("s = " + s);

        int t = 0;
        for (int i = 3; i <= n; i++) {

            t = f + s;
            System.out.println("t == " + t);
            f = s;
            s = t;

        }
    }

}
