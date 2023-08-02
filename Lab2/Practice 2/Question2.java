public class Question2 {

    public static void main(String[] args) {

        int x = 10;
        System.out.println("before invoking X in main ");
        x();
        Test2.z();
        System.out.println("after invoking X in main ");
    }

    public static void x() {

        System.out.println("before invoking Y in main ");
        y();
        System.out.println("after invoking Y in main ");
    }

    public static void y() {

        System.out.println("starting of Y");
        System.out.println("Ending of Y ");

    }
}

class Test2 {

    public static void z() {

        System.out.println("starting of Z ");
        System.out.println("Ending of Z ");

    }
}