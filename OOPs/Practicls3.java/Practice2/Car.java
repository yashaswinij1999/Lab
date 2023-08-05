public class Car {

    private int fuel;
    boolean isStarted;

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void start() {

        if (fuel > 0) {

            isStarted = true;
            System.out.println("the car started");

        }

    }

    public void drive() {

        if (fuel > 0) {

            if (isStarted == true) {
                System.out.println("the driver stared to drive the car");
                fuel--;
            }

        } else {

            stop();

        }

    }

    public void reverse() {

        if (fuel > 0) {

            if (isStarted == true) {

                System.out.println("the driver reversing the car ");
                fuel--;

            }

        } else {

            stop();
        }

    }

    public void stop() {

        if (fuel == 0) {
            isStarted = false;
            System.out.println("the car stopped as there is no fuel");
        }

    }
}

class TestCar {

    public static void main(String[] args) {

        Car c = new Car();
        c.setFuel(2);
        c.start();
        c.drive();
        c.reverse();
        System.out.println("fuel qty in the car = " + c.getFuel());
        c.reverse();
        // System.out.println("fuel qty in the car = " + c.getFuel());

    }

}
