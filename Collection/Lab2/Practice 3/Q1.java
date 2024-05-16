
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Q1 {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "rama";
        String s4 = "arjuna";
        String s5 = "Shiva";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // HashSet s = new HashSet<String>();
        // s.add(s1);
        // s.add(s2);
        // System.out.println(s);
        TreeSet st = new TreeSet<>();
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        st.add("ramanna");
        st.add("ramanuja");
        st.add("rameshwara");
        st.add("eshwara");
        st.add("someshwaraa");
        st.add("marirama");

        Iterator it = st.iterator();

        while (it.hasNext()) {
            Object o = it.next();

            if (o instanceof String) {

                String s = (String) o;
                if (s.contains("rama")) {
                    System.out.println(s);
                }

            }

        }

    }

}
