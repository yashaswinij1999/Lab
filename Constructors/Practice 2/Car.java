
public class Car {

    private boolean isStarted = false;
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
        System.out.println("no arg constructor");
    }

    public void setFuel(int fuel) {
        if (fuel <= 0) {
            throw new IllegalArgumentException("invalid fuel ");
        }
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void start() {
        if (fuel > 0) {
            isStarted = true;
            System.out.println("the car started");
        } else {
            stopped();

        }
    }

    public void drive() {
        start();
        if (fuel > 0) {
            System.out.println("the driver started to drive ");
        } else {
            stopped();
        }
        fuel--;

    }

    public void stopped() {
        if (fuel <= 0) {
            System.out.println("the car stopped ");
        }
    }

}

class TestCar {

    public static void main(String[] args) {

        // Car c = new Car(1);
        // c.start();
        // c.drive();
        // c.drive();

    }

}
