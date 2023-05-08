public class Car {

    private int fuel;
    private String name;
    boolean isStarted;

    public void setName(String name) {

        if (name == null || name.equals(" ")) {
            throw new IllegalArgumentException("Invalid name ");
        }
        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setFuel(int fuel) {

        if (fuel < 0) {

            throw new IllegalArgumentException("Invalid fuel Qty");

        }
        this.fuel = fuel;
    }

    public int getFuel() {

        return fuel;

    }

    public void start() {

        if (fuel > 0) {
            isStarted = true;
            System.out.println(" the vehicle started ");
        }

    }

    public void drive() {

        if (isStarted == true) {
            System.out.println(" the car is ready to drive ");
            fuel--;
        }
    }

    public void reverse() {

        if (isStarted == true) {
            System.out.println(" the car reversing ");
            fuel--;

        }
    }

    public void stop() {

        if (fuel < 0) {
            isStarted = false;
            System.out.println(" the car stopped ");
        }

    }
}

class TestCar {

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.setFuel(3);
        c1.start();
        c1.drive();
        c1.reverse();
        c1.drive();
        c1.drive();
        c1.stop();

    }
}
