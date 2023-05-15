import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q1 {

    public static void main(String[] args) {

        String s1 = "pizza";
        String s2 = "burger";
        System.out.println(" object identity check =  " + (s1 == s2));
        System.out.println(" object equality = " + s1.equals(s2));

        String s3 = "soda";
        String s4 = new String("soda");
        System.out.println("s3.hashCode() = " + s3.hashCode());
        System.out.println("s5.hashCode() = " + s4.hashCode());

        Set s = new HashSet<>();
        s.add(s3);
        s.add(s4);
        System.out.println("s= " + s);

        Set<String> str = new TreeSet<>();
        str.add(s3);
        str.add(s4);
        System.out.println("str = " + str);

        str.add("ramanna");
        str.add("ramanuja");
        str.add("rameshwara");
        str.add("eshwara");
        str.add("someshwaraa");
        str.add("marirama");

        for (String st : str) {
            if (st.contains("rama")) {
                System.out.println(st);
            }
        }

    }

}