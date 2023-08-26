import java.util.Set;
import java.util.TreeSet;

public class Q8 {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Scooter", 11);
        Vehicle v2 = new Vehicle("Scooter", 10);

        TreeSet<Vehicle> st = new TreeSet<>();
        st.add(v1);
        st.add(v2);
        System.out.println(st);
    }

}
