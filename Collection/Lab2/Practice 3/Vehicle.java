
import java.util.ArrayList;
import java.util.HashSet;

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
                System.out.println("In equals method");
                return true;
            }

        }
        return false;

    }

    public int hashCode() {
        System.out.println("in hashcode method");
        return (name + capacity).hashCode();
    }

}

class TestVehicle {

    public static void main(String[] args) {

        // Vehicle v1 = new Vehicle("Tata", 100);
        // Vehicle v2 = new Vehicle("Tata", 100);
        // System.out.println(v1.equals(v2));
        // ArrayList l = new ArrayList<>();
        // l.add(v1);
        // System.out.println(l.contains(v1));
        // HashSet s = new HashSet<>();
        // s.add(v1);
        // s.add(v2);
        // System.out.println(s);
    }

}
