
public class Q26 {

    public static void main(String[] args) {

        System.out.println("main starting");
        Z.z();
        x();
        System.out.println("main ending");
       

    }

    public static void x() {

        int i = 0;

        System.out.println("x starting");
        y();
        System.out.println("x ending");

    }

    public static void y() {

        System.out.println("y starting");
        System.out.println("y ending");

    }

}

class Z {

    public static void z() {
        System.out.println("z starting");
        System.out.println("z ending");

    }

}
