
public abstract class Animal {

    String name;

    public Animal() {
        System.out.println("no arg constructor");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("paramterised constuctor");
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("closes its eyes and sleeps");
    }

}

class Croc extends Animal {

    public Croc() {
        System.out.println("no arg constructor in croc");
    }

    public Croc(String name) {
        super(name);
        this.name = name;
        System.out.println("paramterised constuctor in croc");
    }

    public void eat() {
        System.out.println("A croc eating");
    }

    public void swim() {
        System.out.println("A croc can swim");
    }

    public void sleep() {
        System.out.println("opens its eyes and sleeps");
    }

}

class TestAnimal {

    public static void main(String[] args) {

        // Croc c = new Croc("Croco");
        // c.eat();
        // c.sleep();

    }

}
