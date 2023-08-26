import java.util.HashSet;
import java.util.Set;

public class Q14 {

    public static void main(String[] args) {

        String s = "this this is is a what how what is";
        String[] arr = s.split(" ");
        String str = "";

        for (int i = 0; i < arr.length; i++) {

            int count = 0;
            String a = arr[i];

            for (int j = 0; j < arr.length; j++) {

                String b = arr[j];

                if (a.equals(b)) {
                    count++;
                }

            }

            if (count <= 1) {

                str = str + " " + arr[i];

            }

        }
        System.out.println(str);

    }

}
