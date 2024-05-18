
import java.util.TreeSet;

public class Q12 {

    public static void main(String[] args) {

        String s = "If someone offers you something you dont need deny it politely";

        String[] arr = s.split(" ");
        TreeSet t = new TreeSet<>();

        for (String st : arr) {
            t.add(st);
        }

        System.out.println(t);

    }

}
