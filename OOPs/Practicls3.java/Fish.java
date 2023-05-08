public class Fish {

    String name;
    
}
class Croc{

    String name;

    public void eat(Fish f){

        System.out.println(" Croc name = " + name + " Fish name = " + f.name );
        f = new Fish();
        f.name = "Flippy";

    }
}
class TestFish{

    public static void main(String[] args) {
        
        Croc c1 = new Croc();
        c1.name = "Crocky";

        Fish f1 = new Fish();
        f1.name = "Fishy";

        System.out.println("Fish name = " + f1.name);
        c1.eat(null);
        System.out.println("Fish name = " + f1.name);

    }
}
