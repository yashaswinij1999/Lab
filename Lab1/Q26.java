public class Q26 {

    public static void main(String[] args) {

        System.out.println(" starting of method main ");
        Test1.z();
        x();
        System.out.println(" ending of method main  ");

    }

    public static void x() {

        System.out.println(" starting of method x ");
        y();
        System.out.println(" ending of method x  ");

    }

    public static void y() {

        System.out.println(" starting of method y ");
        System.out.println(" ending of method y ");

    }

}

class Test1 {

    public static void z() {

        System.out.println(" starting of method z ");
        System.out.println(" ending of method z ");
    }
}
