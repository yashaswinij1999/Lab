
public class Animal {

}

class Pig extends Animal {

}

class TextEx {

    public static void m1() {
        System.out.println("m1");
        m2();
    }

    public static void m2() {
        System.out.println("m2");
        Animal a = new Pig();
        m3(a);

        Pig p = new Pig();
        m3(p);
    }

    public static void m3(Animal a) {
        System.out.println("m3");
        Pig p = (Pig) a;
    }

    public static void main(String[] args) {
        m1();
    }

}
