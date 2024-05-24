
import java.util.ArrayList;

public class Q4 {

    public static void main(String[] args) {

        String s = "this this is is a what how what is";
        String[] str = s.split(" ");
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        int count = 0;
        String test = "";

        for (int i = 0; i < str.length; i++) {

            count = 0;

            for (int j = 0; j < str.length; j++) {

                if (str[i].equals(str[j])) {
                    count++;

                }

            }
            if (count > 1) {
                l1.add(str[i]);
            }

        }
        System.out.println(l1);

    }
}
