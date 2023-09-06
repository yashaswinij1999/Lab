import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleQ13 {

    public static void main(String[] args) {

        String sentence = "Can you can a can as a canner can can a can";
        String[] split = sentence.split(" ");

        List<String> l1 = new ArrayList<String>(Arrays.asList(split));

        for (int i = 0; i < l1.size(); i++) {

            for (int j = i + 1; j < l1.size(); j++) {
                if (l1.get(i).equals(l1.get(j))) {
                    l1.remove(j);
                    j--;
                }
            }

        }

        System.out.println("After Removing duplicate elements:" + l1);

    }

}
