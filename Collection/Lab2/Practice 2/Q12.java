import java.util.TreeSet;

public class Q12 {

    public static void main(String[] args) {

        String str = "this this is is a what how what is";
        String[] arr = str.split(" ");

        TreeSet<String> st = new TreeSet<>();

        for (String s : arr) {
            st.add(s);
        }

        System.out.println(st);

    }

}
