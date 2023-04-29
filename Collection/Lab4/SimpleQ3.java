import java.util.HashSet;
import java.util.Set;

public class SimpleQ3 {

    public static void main(String[] args) {

        Set<String> st = new HashSet<String>();
        String sentence = "I like New York unique New York I like unique New York";
        String[] words = sentence.split(" ");

        for (String s : words) {
            st.add(s);
        }
        System.out.println("st ===> " + st);

        String temp = "";

        for (String s2 : st) {

            temp = temp + " " + s2;

        }
        System.out.println(" sentence = " + temp);

    }

}
