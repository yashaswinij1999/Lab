public class A {

    static String name = "A";

    public A(String name) {

        System.out.println("para in A");

    }

    public static void print() {

        System.out.println("in A = " + name);

    }
}

class B extends A {

    static String name = "B";

    public B(String name) {

        super(name);
        System.out.println("parametr in B");

    }

    public static void print() {

        System.out.println("in B = " + name);

    }

}

class TestA {

    public static void main(String[] args) {

        B b = new B("bhanu");
        System.out.println(B.name);

        A a = new B("Beda");
        System.out.println(A.name);

        B.print();
        A.print();

    }

}