import java.util.ArrayList;
import java.util.List;

public class Q7 {

    public static void main(String[] args) {

        String sentence = "The brown fox is really lazy";

        String[] split = sentence.split(" ");

        List<String> l = new ArrayList<>();

        for (String s : split) {
            l.add(s);
        }
        System.out.println(l.size());
    }
}