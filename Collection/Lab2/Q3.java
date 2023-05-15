import java.util.HashSet;
import java.util.Set;

public class Q3 {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Yamaha", 100);
        Vehicle v2 = new Vehicle("Honda", 200);
        Vehicle v3 = new Vehicle("TVS", 300);
        Vehicle v4 = new Vehicle("Scooty pep", 50);
        Vehicle v5 = new Vehicle("Duo", 10);
        Vehicle v6 = new Vehicle("Yamaha", 100);

        Set s = new HashSet<>();
        s.add(v1);
        s.add(v6);
        System.out.println("s == " + s);
        System.out.println("v1.hashCode() = " + v1.hashCode());
        System.out.println("v6.hashCode() = " + v6.hashCode());

    }

}
