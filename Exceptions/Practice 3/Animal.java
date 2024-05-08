
public class Animal {

    String name;

    public Animal() {
        System.out.println("no arg in animal");
    }

    public Animal(String name) {
        System.out.println("param in animal");
        this.name = name;
    }

}

class Pig extends Animal {

    public Pig() {
        System.out.println("no arg in pig");
    }

    public Pig(String name) {
        super(name);
        System.out.println("param in pig");
    }

}

class TextEx {

    public static void m1() {
        System.out.println("m1");
        m2();
    }

    public static void m2() {
        System.out.println("m2");
        // Animal a = new Pig();
        // m3(a);

        // Pig p = new Pig();
        // m3(p);
    }

    public static void m3(Animal a) {
        System.out.println("m3");
        // Pig p = (Pig) a;
    }

    public static void main(String[] args) {
        m1();

        Pig p = new Pig("piggie");
        System.out.println(p.name);

    }

}
