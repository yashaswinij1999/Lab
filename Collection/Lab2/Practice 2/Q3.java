import java.util.HashSet;
import java.util.Set;

public class Q3 {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Scooter", 10);
        Vehicle v2 = new Vehicle("Scooter", 10);

        Set<Vehicle> st = new HashSet<>();
        st.add(v1);
        st.add(v2);

        System.out.println(st);

    }

}
