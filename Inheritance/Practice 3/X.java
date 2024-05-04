
public class X {

    int a = 10;
    static int b = 15;

    static {
        System.out.println("in static initialiser 1 b = " + b);
        b = 60;
    }

    static {
        System.out.println("in static initialiser 2 b = " + b);
        b = 100;
        b++;
    }

    {
        System.out.println("in instance initialiser 1 a = " + a);
        a = 20;
    }

    {
        System.out.println("in instance initialiser 2 a = " + a);
        a = 30;
    }

    public X() {
        System.out.println("no arg constructor" + " a : " + a);
        a = 40;
    }

    public X(int x) {
        System.out.println("in X param constr with x " + a);
        a = x;
    }

}

class Y extends X {

    int c = 1;
    static int d = 5;

    static {
        System.out.println("in static initialiser 1 d = " + d);
        d = 6;
    }

    static {
        System.out.println("in static initialiser 2 d = " + d);
        d = 10;
        d++;
    }

    {
        System.out.println("in instance initialiser 1 c = " + c);
        c = 20;
    }

    {
        System.out.println("in instance initialiser 2 c = " + c);
        c = 30;
    }

    public Y() {
        System.out.println("no arg constructor" + " c : " + c);
        c = 40;
    }

    public Y(int y) {
        super(y);
        System.out.println("in Y param constr with y " + y);
        c = y;
    }

}

class TestX {

    public static void main(String[] args) {

        /* 
        X x = new X();
        System.out.println(x.a);
        System.out.println(x.b);

        // X x2 = new X();
        // System.out.println(x2.b);
        Y y = new Y();
        System.out.println(y.c);
        System.out.println(y.d);

        Y y1 = new Y(99);
         */
    }

}
