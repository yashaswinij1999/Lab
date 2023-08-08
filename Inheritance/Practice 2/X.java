public class X {

    int a = 10;
    static int b = 15;

    static {

        System.out.println("in static init 1 b = " + b);
        b = 50;

    }

    static {

        System.out.println("in static init 2 b = " + b);
        b = 100;

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
        super();
        System.out.println("a = " + a);
        a = 40;
    }

    public X(int x) {
        super();
        System.out.println("in parameterised constructor = " + x);
        a = x;

    }

}

class Y extends X {

    int c = 10;
    static int d = 15;

    static {

        System.out.println("in static init 1 d = " + d);
        d = 50;

    }

    static {

        System.out.println("in static init 2 d = " + d);
        d = 100;

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

        super();
        System.out.println("a = " + c);
        c = 40;
    }

    public Y(int y) {

        super(y);
        System.out.println("in parameterised constructor = " + y);
        c = y;

    }

}

class TestX {

    public static void main(String[] args) {

        X obj = new X();
        System.out.println("a = " + obj.a);
        System.out.println("b = " + X.b);

        X obj2 = new X();
        System.out.println("a = " + obj2.a);
        System.out.println("b = " + X.b);

        X obj3 = new X();
        System.out.println("a = " + obj3.a);
        System.out.println("b = " + X.b);

        Y ob = new Y();
        System.out.println("c = " + ob.c);
        System.out.println("d = " + Y.d);

        Y ob1 = new Y();
        System.out.println("c = " + ob1.c);
        System.out.println("d = " + Y.d);

        Y ob2 = new Y(99);

    }

}