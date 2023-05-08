public class Cow{

    String name;

    public void moo(){

        System.out.println(" cow shouting its name = " + name);

    }
}
class TestCow{

    public static void main(String[] args) {
        
        Cow c1 = new Cow();
        c1.name = "Lakshmi";
        c1.moo();

        Cow c2 = new Cow();
        c1 = c2;
        c1.name = "Gowri";
        System.out.println("c2.name = " + c1.name);

    }
}