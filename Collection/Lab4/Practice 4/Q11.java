
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q11 {

    public static void main(String[] args) {

        /* 
        Converting array to arraylist

        String[] str = {"rama", "sita"};
        List l = Arrays.asList(str);

        ArrayList l1 = new ArrayList<>(l);
        l1.add("hanuman");
        System.out.println(l1);

         */
        List<String> l = new ArrayList<>();
        l.add("rama");
        l.add("sita");

        String[] ar = l.toArray(new String[10]);

        ar[2] = "ranga";
        for (String s : ar) {
            System.out.println(s);
        }

    }

}
