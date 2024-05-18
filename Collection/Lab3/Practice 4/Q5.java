
import java.util.LinkedHashMap;

public class Q5 {

    public static void main(String[] args) {

        String s = " this this is is a what how what is";

        String[] str = s.split(" ");
        LinkedHashMap<String, Integer> m = new LinkedHashMap();

        for (String st : str) {
            Integer occurance = m.get(st);

            if (occurance == null) {
                m.put(st, 1);
            } else {
                m.put(st, occurance + 1);
            }

        }
        System.out.println(m);

    }

}
