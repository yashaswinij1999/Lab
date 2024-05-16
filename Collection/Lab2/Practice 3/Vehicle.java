
import java.util.ArrayList;

public class Vehicle {

    String name;
    int capacity;

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

}

class TestVehicle {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Tata", 100);
        Vehicle v2 = new Vehicle("Tata", 100);

        System.out.println(v1.equals(v2));

        ArrayList l = new ArrayList<>();
        l.add(v1);
        System.out.println(l.contains(v1));

    }

}
