import javax.print.attribute.standard.Destination;

public class Human {

    String name;
    Dog dog;
    Car car;
    Song song;

    public Human() {
        System.out.println("no arg constructor in human class");
    }

    public void setName(String name) {

        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void commute(String destination) {
        Car car = new Car();
        car.setFuel(1);
        car.start();
        car.drive();
        car.stop();
        System.out.println("Person has reached the distination = " + destination);
    }

    public void sing() {
        Song song = new Song("Akash");
        song.setLyrics("neene neene");
        song.play();
        System.out.println("person has played a favorie song");
    }

    public void walk() {
        Dog dog = new Dog();
        dog.setName("raju");
        dog.setSize(7);
        dog.bark();
        System.out.println(" Person took his dog for walking ");

    }

    public void eat(Food f) {

        System.out
                .println("the person is eating a food with name = " + f.getFoodName() + " with Person name = " + name);
    }

    public static void generatePrimeNumber(int n) {

        for (int i = 2; i <= n; i++) {

            if(i == 2 || i == 3){
                System.out.println("i == " + i);
            }

            if(i % 2 != 0){
                if(i % 3 != 0){
                    System.out.println(" i == " + i);
                }
            }

            
        }
    }
}

class Food {

    private String foodName;
    private double price;

    public Food() {
        System.out.println("no argument contr in Food Class");
    }

    public void setFoodName(String foodName) {

        if (foodName == null || foodName.equals("")) {
            throw new IllegalArgumentException("Invalid foodName");
        }
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setAge(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Invalid price");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}

class TestHuman {

    public static void main(String[] args) {

        Human h1 = new Human();
        h1.setName("Romeo");
        h1.commute("Paris");
        h1.sing();
        h1.walk();

        Food f1 = new Food();
        f1.setFoodName("pizza");
        h1.eat(f1);

        Human.generatePrimeNumber(7);

    }
}