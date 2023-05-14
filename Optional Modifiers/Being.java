public class Being {

    String name;
    Car car;
    // Dog dog;
    Song song;

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Invlaid name ");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void commute(String destination) {
        Car car = new Car();
        car.setFuelQty(5);
        car.isStarted();
        car.drive();
        car.stop();
        System.out.println("the person has reached the destination = " + destination);
    }

    public void sing() {
        Song song = new Song();
        song.play("Akash", "neene neene");

    }

    public void walk() {
        Dog dog = new Dog();
        dog.setSize(16);
        dog.bark();
    }

    public void eat(Food f) {

        System.out.println("the person " + name + "  is eating food = " + f.getName());

    }

    public static void generatePrimeNumber(int n) {

        for (int i = 2; i <= n; i++) {

            if (i == 2 || i == 3) {
                System.out.println(i);
            }

            if (i % 2 != 0) {
                if (i % 3 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

class TestBeing {

    public static void main(String[] args) {

        Being be = new Being();
        be.setName("ram");
        be.commute("Paris");
        be.sing();
        be.walk();

        Food f = new Food();
        f.setName("idly");
        be.eat(f);

        Being.generatePrimeNumber(11);

    }
}