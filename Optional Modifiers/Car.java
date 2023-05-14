public class Car {

    private int fuelQty;
    boolean isStarted;

    public void setFuelQty(int fuelQty) {
        if (fuelQty <= 0) {
            throw new IllegalArgumentException();
        }
        this.fuelQty = fuelQty;
    }

    public int getFuelQty() {
        return fuelQty;
    }

    public void isStarted() {
        if (fuelQty > 0) {
            isStarted = true;
            System.out.println("the vehicle starts");
        }
    }

    public void drive() {
        if (isStarted == true) {
            System.out.println("the vehile started driving ");
            fuelQty--;
        }
    }

    public void stop() {
        if (fuelQty <= 0) {
            isStarted = false;
            System.out.println("the vehicle stops");
        }
    }

}
