
import java.util.stream.Stream;

public class Qa {

    public static void main(String[] args) {

        String s1 = args[0];
        String s2 = args[1];
        // System.out.println(s.length());

        // if (s.length() < 12) {
        //     System.out.println("You have good name " + s);
        // } else {
        //     System.out.println("You have a long name " + s);
        //     if (i % 2 == 0) {
        //         System.out.print(s.charAt(i));
        //         System.out.print("");
        //     } else {
        //         System.out.print("");
        //         System.out.println(s.charAt(i));
        if (s1.equals(s2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }

}
