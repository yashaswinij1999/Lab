public class Q24 {

    public static void main(String[] args) {

        int x = 10;
        System.out.println("x = " + x);
        process(x);
        System.out.println("x = " + x);

    }

    public static void process(int x) {

        x = 20;
        System.out.println("x in process = " + x);

    }

}
