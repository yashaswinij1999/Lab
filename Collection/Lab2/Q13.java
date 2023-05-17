import java.util.LinkedHashSet;
import java.util.Set;

public class Q13 {

    public static void main(String[] args) {

        String sentence = "ringa ringa roses pocket full of roses";
        String[] split = sentence.split(" ");

        Set<String> st = new LinkedHashSet<>();
        for (String s : split) {
            st.add(s);
        }

        System.out.println("all the unique words without duplicates in the same order = " + st);

    }

}
