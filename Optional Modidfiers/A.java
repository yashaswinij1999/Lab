public class A {

    final int p;
    public static final int R = 5;

    public A(int p) {
        this.p = p;
        System.out.println("p == " + p);
    }

}

class TestA {

    public static void main(String[] args) {

        A a = new A(10);
        System.out.println("A.R = " + A.R);
        

    }
}