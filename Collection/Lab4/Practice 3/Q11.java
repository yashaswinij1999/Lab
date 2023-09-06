import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q11 {

    public static void main(String[] args) {

        String[] str = { "rama", "bhama", "shama" };
        List<String> l = Arrays.asList(str);

        l = new ArrayList<>(l);
        l.add("soma");

        System.out.println(l);

        String[] arr = new String[l.size()];
        arr = l.toArray(arr);

        for (String o : l) {
            System.out.println(o);
        }

    }

}
