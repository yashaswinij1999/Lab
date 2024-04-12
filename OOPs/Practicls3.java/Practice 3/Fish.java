
public class Fish {

    String name;

}

class Croc {

    String name;

    public void eat(Fish f) {

        System.out.println(" Croc " + name + " eating fish " + f.name);
        f = null;
        f = new Fish();
        f.name = "Flippy";

    }

}

class Test {

    public static void main(String[] args) {

        Fish f = new Fish();
        f.name = "Fishy";
        System.out.println(f.name);

        Croc c = new Croc();
        c.name = "Crocky";
        c.eat(f);
        System.out.println(f.name);

        f = null;
        c = null;
    

    }

}
