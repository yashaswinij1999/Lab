public abstract class Animal {

    String name;

    public Animal() {

        System.out.println("no arg constructor in Animal ");

    }

    public Animal(String name) {

        System.out.println("parameteresied constructor in Animal " + name);

    }

    public abstract void eat();

    public void sleeps() {

        System.out.println("it closes its eyes and sleeps");

    }

}

class Croc extends Animal {

    public Croc() {

        System.out.println("no arg constructor in Croc ");

    }

    public Croc(String name) {

        super(name);
        System.out.println("parameteresied constructor in Croc " + name);

    }

    public void eat() {

        System.out.println("croc eats");

    }

    public void sleeps() {

        System.out.println("it opens its eyes and sleeps");

    }

}

class TestAni {

    public static void main(String[] args) {

        Croc c = new Croc("Crocodile");
        c.eat();

    }

}