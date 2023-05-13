public class Animal {

    String name;

    public Animal() {
        System.out.println("no argument constructor in animal class");
    }

    public void eat() {
        System.out.println("animal can eat");
    }

    public void dance() {
        System.out.println("aninal can dance");
    }

    public void sleep() {
        System.out.println("animal can sleep");
    }

}

class Hippo extends Animal {

    public Hippo() {
        System.out.println("no argument constructor in Hippo class");
    }

    public void smoke() {
        System.out.println("hippo can smoke");
    }
}

class Tiger extends Animal {

    public Tiger() {
        System.out.println("no argument constructor in Tiger class");
    }
}

class Croc extends Animal {

    public Croc() {
        System.out.println("no argument constructor in Croc class");
    }

    public void swim() {
        System.out.println("croc can swim");
    }
}

class Vet {

    public Vet() {
        System.out.println("no argument constructor in vet class ");
    }

    public void treat(Animal a) {
        if (a instanceof Hippo) {
            Hippo h = (Hippo) a;
            h.smoke();
        }
    }
}

class TestAnimal {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();
        a.sleep();
        a.dance();

        Hippo h = new Hippo();
        h.eat();

        Croc c = new Croc();

        Vet v = new Vet();
        // v.treat(c);
        v.treat(h);
        

    }
}