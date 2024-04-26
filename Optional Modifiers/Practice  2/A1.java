
public class A1 {

    static String name = "A";

    public A1() {

        System.out.println(name);
    }

    public static void print() {
        System.out.println("In A : " + name);
    }

}

class B extends A1 {

    static String name = "B";

    public B() {

        System.out.println(name);
    }

    public static void print() {
        System.out.println("In B : " + name);
    }

}

class TestAB {

    public static void main(String[] args) {

        B b = new B();
        // System.out.println(b.name);
        b.print();

        A1 a = new A1();
        // System.out.println(a.name);
        a.print();
    }

}
