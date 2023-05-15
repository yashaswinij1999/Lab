import java.util.ArrayList;
import java.util.List;

public class Vehicle {

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

}

class TestVehicle {

    public static void main(String[] args) {
        
        Vehicle v1 = new Vehicle("Yamaha", 100);
        Vehicle v2 = new Vehicle("Yamaha", 100);
        System.out.println("v1.equals(v2)= " +  v1.equals(v2));
        
        List l = new ArrayList<>();
        l.add(v1);
        System.out.println("l.contains(v2) = " + l.contains(v2));
        


    }
}
