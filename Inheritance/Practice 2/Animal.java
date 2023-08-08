
public class Animal {

    String name;

    public Animal() {

        System.out.println("no arg constructor in Animal ");

    }

    public Animal(String name) {

        System.out.println("parameterised constructor in Animal ");
        this.name = name;

    }

    public void eat() {

        System.out.println("Animal can eat");

    }

    public void sleep() {

        System.out.println("Animal can sleep and snore ");

    }

    public void dance() {

        System.out.println("Animal can dance");

    }

}

class Hippo extends Animal {

    public void smoke() {

        System.out.println("a hippo can smoke");

    }

}

class Tiger extends Animal {

}

class Croc extends Animal {

    public void swim() {

        System.out.println("a croc can swim");

    }

}

class Vet {

    public void treat(Animal a) {

        a.sleep();
        a.eat();
        a.dance();

        if (a instanceof Croc) {
            Croc c = (Croc) a;
            c.swim();
        }

        if (a instanceof Hippo) {
            Hippo h = (Hippo) a;
            h.smoke();
        }

    }

}

class TestAnimal {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.dance();
        a.eat();
        a.sleep();

        Hippo h = new Hippo();
        h.dance();

        Croc c = new Croc();
        c.swim();

        Tiger t = new Tiger();
        t.eat();

        Vet v = new Vet();
        v.treat(h);
        v.treat(c);
        v.treat(t);

    }

}