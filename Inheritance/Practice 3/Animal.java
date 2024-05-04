
public class Animal {

    private String name;

    public void getName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Animal() {
        System.out.println("no arg constructor in animal");
    }

    public void eat() {
        System.out.println("A animal can eat");
    }

    public void sleep() {
        System.out.println("a animal snores and  sleeps");
    }

    public void dance() {
        System.out.println("a animal can dance");
    }
}

class Hippo extends Animal {

    public Hippo() {
        System.out.println("no arg constructor in Hippo");
    }

    public void smoke() {
        System.out.println("A hippo can smoke");
    }

}

class Croc extends Animal {

    public Croc() {
        System.out.println("no arg constructor in Croc");
    }

    public void swim() {
        System.out.println("a croc can swim");
    }

}

class Tiger extends Animal {

    public Tiger() {
        System.out.println("no arg constructor in Tiger");
    }

}

class vet {

    public void test(Animal a) {
        if (a instanceof Hippo) {
            Hippo h = (Hippo) a;
            h.smoke();
        }
        System.out.println("A vet treats animal");
    }

}

class TestAnimal {

    public static void main(String[] args) {

        /* 
        Animal a = new Animal();
        a = new Hippo();
        a = new Croc();
        a = new Hippo();
        
        Croc c = new Croc();
        Hippo h = new Hippo();

        vet v = new vet();
        v.test(c);
        v.test(h);
         */
    }

}
