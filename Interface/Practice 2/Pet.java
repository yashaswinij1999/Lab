public interface Pet {

    int X = 10;
    String NAME = "Pingu";

    public void play();

}

class Dog implements Pet {

    @Override
    public void play() {

        // TODO Auto-generated method stub
        System.out.println("dog playing");

    }

    public void bark() {

        System.out.println("the dog barks");

    }

}

class Test {

    public static void main(String[] args) {

        Pet p = new Dog();
        p.play();
        System.out.println(Pet.NAME);

    }

}