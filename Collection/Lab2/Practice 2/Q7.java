import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Q7 {

    public static void main(String[] args) {

        String s = "can i get can can can Can cannor can";

        String[] arr = s.split(" ");

        Set<String> st = new HashSet<>();
        Set<String> l = new LinkedHashSet<>();

        for (String str : arr) {
            st.add(str);
            l.add(str);
        }

        System.out.println(st);
        System.out.println(l);

    }

}
