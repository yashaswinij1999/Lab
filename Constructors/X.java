public class X {

    int a = 10;
    static int b = 15;

    static{
        System.out.println("in static init 1 b = " + b);
        b = 50;
    }

    static{
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

    public X(){

        System.out.println("a == " + a);
        a = 40;
    }
}
class TestX{

    public static void main(String[] args) {
        
        X x1 = new X();
        System.out.println("x1.a === " + x1.a);
        System.out.println("X.b === " + X.b);

        X x2 = new X();
        System.out.println("x1.a === " + x1.a);
        System.out.println("X.b === " + X.b);


    }

}
