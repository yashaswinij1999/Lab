import java.util.Set;
import java.util.TreeSet;

public class Q8 {

    public static void main(String[] args) {
        

        Set s1 = new TreeSet<>();
        Vehicle v1 = new Vehicle("Yamaha", 100);
        Vehicle v2 = new Vehicle("Honda", 200);
        Vehicle v3 = new Vehicle("TVS", 300);
        Vehicle v4 = new Vehicle("Scooty pep", 50);
        Vehicle v5 = new Vehicle("Duo", 10);
        Vehicle v6 = new Vehicle("Yamaha", 100);

        s1.add(v1);
        s1.add(v2);
        s1.add(v3);
        s1.add(v4);
        s1.add(v5);
        s1.add(v6);
        System.out.println(s1);
    }
    
}
