import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Q1 {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println("equality check  = " + s1.equals(s2));
        System.out.println("identity check  = " + (s1 == s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Set<String> st = new HashSet<>();
        st.add(s1);
        st.add(s2);

        // System.out.println(st);

        Set<String> ts = new TreeSet<>();
        ts.add("rama");
        ts.add("seetha");
        ts.add("hanumnatha");
        ts.add("ramanna");
        ts.add("ramanuja");
        ts.add("rameshwara");
        ts.add("eshwara");
        ts.add("someshwara");
        ts.add("marirama");

        Iterator it = ts.iterator();

        while (it.hasNext()) {

            Object o1 = it.next();

            if (o1 instanceof String) {

                String s = (String) o1;

                if (s.contains("rama")) {
                    System.out.println(s);
                }

            }

        }

    }

}