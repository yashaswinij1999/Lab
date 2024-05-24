
import java.util.HashSet;
import java.util.Set;

public class Q3 {

    public static void main(String[] args) {

        String s = "this this is is a what how what is";

        String[] arr = s.split(" ");
        Set<String> st = new HashSet<>();

        for (String str : arr) {
            st.add(str);
        }

        System.out.println(st);
    }

}
