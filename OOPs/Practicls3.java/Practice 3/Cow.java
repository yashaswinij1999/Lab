
public class Cow {

    String name;

    public void moo() {
        System.out.println("Cow mooing its name " + name);
    }

}

class TestCow {

    public static void main(String[] args) {

        Cow c1 = new Cow();
        c1.name = "Raani";
        c1.moo();

        Cow c2 = new Cow();
        c2.name = "lakshmi";
        c2.moo();

        c1 = c2;
        c1.name = "gowri";
        c2.moo();

        c1 = null;
        c2  = null;

    }

}
