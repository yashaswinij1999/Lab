import java.util.LinkedHashSet;

public class Q13 {

    public static void main(String[] args) {

        String str = "this this is is a what how what is";
        String[] arr = str.split(" ");

        LinkedHashSet<String> ls = new LinkedHashSet<>();

        for (String s : arr) {
            ls.add(s);
        }

        System.out.println(ls);

    }

}
