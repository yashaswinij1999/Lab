import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question8 {

    public static void main(String[] args) {

        String[] arr = { "jan", "feb", "march", "april" };
        List<String> l = Arrays.asList(arr);
        String s = "";

        Collections.reverse(l);
        System.out.println(" using library methods = " + l);

        for (int i = 0; i < arr.length; i++) {

            s = arr[arr.length - 1 - i] + " " + s;

        }
        System.out.println(" not using library methods = " + s);

    }

}
