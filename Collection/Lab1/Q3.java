import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Q3 {

    public static void main(String[] args) {

        Collection<String> col = new ArrayList<String>();
        col.add("rama");
        col.add("ranga");
        col.add("shama");
        col.add("bhama");
        col.add("vittal");
        col.add("mukunda");
        col.add("rama");
        col.add("ramaramarai");
        System.out.println(col);
        System.out.println(col.size());

        String s1 = "rama";
        String s2 = new String("rama");

        col.add(s1);
        col.add(s2);

        System.out.println("col = " + col);
        System.out.println(col.contains(s1));
        System.out.println(col.remove(s1));
        System.out.println("col = " + col);

        Collection col2 = new LinkedList<>();
        col2.addAll(col);
        System.out.println("col2 = " + col2);

    }

}
