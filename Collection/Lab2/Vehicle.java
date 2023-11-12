import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Comparable {

    String name;
    int engineCapacity;

    public Vehicle(String name, int engineCapacity) {
        this.name = name;
        this.engineCapacity = engineCapacity;
    }

    public boolean equals(Object o1) {

        if (o1 instanceof Vehicle) {
            Vehicle v = (Vehicle) o1;

            if (this.name.equals(v.name) || this.engineCapacity == v.engineCapacity) {
                return true;
            }

        }
        return false;
    }

    public int hashCode() {
        return (name + engineCapacity).hashCode();
    }

    public String toString() {
        return "Vehicle : " + name + "," + "engineCapacity = " + engineCapacity;
    }

    public int compareTo(Object o1) {

        if (o1 instanceof Vehicle) {
            Vehicle v = (Vehicle) o1;

            return this.engineCapacity - v.engineCapacity;
        }
        throw new IllegalArgumentException("Invalid object");

    }

}

class TestVehicle {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Yamaha", 100);
        Vehicle v2 = new Vehicle("Yamaha", 100);
        System.out.println("v1.equals(v2)= " + v1.equals(v2));

        List l = new ArrayList<>();
        l.add(v1);
        System.out.println("l.contains(v2) = " + l.contains(v2));

    }
}
