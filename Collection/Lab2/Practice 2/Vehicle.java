import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    String name;
    int capacity;

    public Vehicle() {

    }

    public Vehicle(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public boolean equals(Object o) {

        if (o instanceof Vehicle) {

            Vehicle v = (Vehicle) o;

            if (this.name.equals(v.name) && this.capacity == v.capacity) {
                return true;
            }

        }
        return false;

    }

    public String toString() {

        return name + capacity;

    }

}

class TestVehicle {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Scooter", 10);
        Vehicle v2 = new Vehicle("Scooter", 10);

        System.out.println(v1.equals(v2));

        System.out.println(v1);
        System.out.println(v2);

        ArrayList<Vehicle> l = new ArrayList<>();
        l.add(v1);

        System.out.println(l);
        System.out.println(l.contains(v2));

    }

}
