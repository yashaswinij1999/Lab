public class Q1 {

    public static void main(String[] args) {

        try {
            System.out.println(args[0]);

        } catch (Throwable e) {

            e.printStackTrace();

        }
        System.out.println("in main");
    }

}