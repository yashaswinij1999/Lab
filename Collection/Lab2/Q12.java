import java.util.Set;
import java.util.TreeSet;

public class Q12 {

    public static void main(String[] args) {

        String sentence = "twinkle twinkle little star how i wonder what you are";
        String[] split = sentence.split(" ");

        Set<String> st = new TreeSet();

        for (String s : split) {
            st.add(s);
        }

        System.out.println("sorting of words == " + st) ;

    }

}
