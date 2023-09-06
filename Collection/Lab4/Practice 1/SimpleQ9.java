import java.util.HashSet;
import java.util.Set;

public class SimpleQ9 {

    public static void main(String[] args) {

        Set<String> s = new HashSet<String>();
        s.add("rama");
        s.add("seetha");
        s.add("arjuna");
        s.add("shiva");
        s.add("parvathi");
        s.add("brama");

        String temp = "";

        for (String s2 : s) {

            temp = temp + " " + s2;
        }
        System.out.println(" temp = " + temp);
    }

}
