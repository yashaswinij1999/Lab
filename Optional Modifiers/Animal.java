public abstract class Animal {

    String name;

    public Animal() {
        System.out.println("no arg in animal");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("par constr in animal");
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("a animal can sleep , it closes its eyes and sleeps");
    }
}

class Croc extends Animal {

    public Croc() {
        System.out.println("no arg in Croc");
    }

    public Croc(String name) {
        super(name);
        this.name = name;
        System.out.println("par constr in Croc");
    }

    public void swim(){
        System.out.println(" a croc can swim ");
    }

    public void eat(){
        System.out.println( "a croc can eat ");
    }

    public void sleep(){
        System.out.println("a croc can sleep ");
    }

}

class Testing {

    public static void main(String[] args) {

        Animal a = new Croc();
        a.eat();
        a.sleep();
        

    }
}
