import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q11 {

    public static void main(String[] args) {

        String[] str = { "ram", "soma", "leela" };

        List<String> l = new ArrayList<>(Arrays.asList(str));
        l.add("ram");
        l.add("deeksha");
        System.out.println(l);

        String[] sa = new String[l.size()];
        sa = l.toArray(sa);

        for (String s : sa) {
            System.out.println(s);
        }

    }

}
