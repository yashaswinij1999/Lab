
public class Human {

    String name;
    Car c;
    Dog d;
    Song song;

    public void commute(String place) {

        c = new Car(5);
        c.start();
        c.drive();
        c.stopped();
        System.out.println("the person has reached the destination");

    }

    public void Sing() {

        song = new Song("Akash", "neene neene");
        song.play();

    }

    public void walk() {
        d = new Dog(6);
        d.bark();
    }

    public void eat(Food f) {

        System.out.println("the person with name " + name + " is eating food with name " + f.getName());

    }

    public boolean generatePrime(int num) {

        if (num < 2) {
            return false;
        }

        if (num == 2 || num == 3 || num == 5 || num == 7) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

}

class Food {

    private String name;
    private int price;

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Invalid Food name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {

        if (price <= 0) {
            throw new IllegalArgumentException("invalid price");
        }
        this.price = price;

    }

    public int getPrice() {
        return price;
    }

}

class TestHuman {

    public static void main(String[] args) {

        Human h = new Human();
        h.name = "Shiva";
        h.commute("agra");
        h.Sing();
        h.walk();

        Food f = new Food();
        f.setName("idly");
        h.eat(f);
        System.out.println(h.generatePrime(69));

    }

}
