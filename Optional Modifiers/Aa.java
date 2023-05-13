public class Aa {

   static String name = "A";

    public Aa(String name) {
        System.out.println("param constructor in Aa class");
    }

    public static void print(){
        System.out.println("in Aa name = "+ name);
    }

}
class B extends Aa{

    static String name = "B";

    public B(String name) {
        super(name);
        System.out.println("param constructor in B class");
    }

    public static void print(){
        System.out.println("in B name = "+ name);
    }

}
class TestAa{

    public static void main(String[] args) {
        
        B b = new B("B1");
        Aa a = new B("B2");
        System.out.println(b.name);
        System.out.println(a.name);

        Aa.print();
        B.print();

    }
}