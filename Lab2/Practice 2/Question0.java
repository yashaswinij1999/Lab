public class Question0 {

    public static void main(String[] args) {

        System.out.println("before invoking");
        print();
        System.out.println("after invoking");

    }

    public static int print() {
        if (1 != 2)
            return 1;
        else
            return 2;
    }
}
