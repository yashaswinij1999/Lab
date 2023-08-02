public class MethodTest {

    public static void main(String[] args) {

        System.out.println(" starting of main method ");
        System.out.println(print());
        System.out.println(" ending of main method ");

    }

    public static int print() {
        if (1 != 2)
            return 1;
        else
            return 0;
    }

}
