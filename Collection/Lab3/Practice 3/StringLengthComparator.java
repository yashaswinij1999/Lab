import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

    public int compare(String o1, String o2) {

        if (o1 instanceof String && o2 instanceof String) {

            String s1 = (String) o1;
            String s2 = (String) o2;

            return s1.length() - s2.length();

        }
        throw new IllegalArgumentException("Invalid Input");

    }

}
