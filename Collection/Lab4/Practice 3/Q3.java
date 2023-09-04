import java.util.HashSet;
import java.util.Set;

public class Q3 {

    public static void main(String[] args) {

        String sentence = "Betty Botter bought some butter but she said the butter bitter If I put it in my batter it will make my batter bitter";
        String[] arr = sentence.split(" ");

        Set<String> s = new HashSet<>();

        for (String str : arr) {

            s.add(str);

        }

        System.out.println("the words without duplicates:" + s);

    }

}
