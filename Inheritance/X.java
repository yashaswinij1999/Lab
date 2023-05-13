public class X {

    int a = 10;
    static int b = 15;

    public X(int x) {

        System.out.println(" in X param constr with x = " + x);
        a = x;
    }

    static {

        System.out.println("in static init 1 b = " + b);
        b = 50;

    }

    static {

        System.out.println("in static init 2 b = " + b);
        b = 75;

    }

    {
        System.out.println("in inst init 1 a = " + a);
        a = 20;
    }

    {
        System.out.println("in inst init 2 a = " + a);
        a = 30;
    }

    public X() {
        System.out.println("in no argument constructor a = " + a);
        a = 40;
    }

}

class Y extends X {
    int c = 10;
    static int d = 15;

    public Y(int y) {
        super(y);
        System.out.println(" in X param constr with x = " + y);
        c = y;
    }

    static {

        System.out.println("in static init 1 d = " + d);
        d = 50;

    }

    static {

        System.out.println("in static init 2 d = " + d);
        d = 75;

    }

    {
        System.out.println("in inst init 1 c = " + c);
        c = 20;
    }

    {
        System.out.println("in inst init 2 c = " + c);
        c = 30;
    }

    public Y() {
        System.out.println("in no argument constructor c = " + c);
        c = 40;
    }

}

class TestX {

    public static void main(String[] args) {

        X obj = new X();
        System.out.println("a = " + obj.a);
        System.out.println("b = " + X.b);

        X obj1 = new X();
        System.out.println("a = " + obj1.a);
        System.out.println("b = " + X.b);

        Y obj2 = new Y();
        System.out.println(" c = " + obj2.c);
        System.out.println(" d = " + Y.d);

        Y obj3 = new Y(99);

    }
}