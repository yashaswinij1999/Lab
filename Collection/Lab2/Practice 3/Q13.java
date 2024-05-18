
import java.util.LinkedHashSet;

public class Q13 {

    public static void main(String[] args) {

        String s = "this this is is a what how what is";

        LinkedHashSet l = new LinkedHashSet<>();
        String[] str = s.split(" ");

        for (String st : str) {
            l.add(st);
        }
        System.out.println(l);
    }

}
