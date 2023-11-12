package animal;

public class Dog {

    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;

}

class TestDog {

    public static void main(String[] args) {

        // Dog d = new Dog();
        // System.out.println(d.a); private members can be accessible within that class
        // System.out.println(d.b); package members can be accessible only within that
        // package;
        // System.out.println(d.c);protected members are sub class scoped;
        // System.out.println(d.d); public members can be accesible in every members

    }

}
