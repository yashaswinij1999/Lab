import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q14 {

    public static void main(String[] args) {

        String sentence = "this this is is a what how what is ";
        String[] split = sentence.split(" ");

        
        List<String> l = new ArrayList();

        for (String s : split) {
            l.add(s);
        }

        int count = 0;
        for (int i = 0; i < l.size(); i++) {

            count = 0;
            for (int j = 0; j < l.size(); j++) {

                if (l.get(i).equals(l.get(j))) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("non repeating words == " + l.get(i));
            }
        }
    }

}
