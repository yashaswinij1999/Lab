import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleQ12 {

    public static void main(String[] args) {

        String[] string = { "rama", "vishu", "maheshwara" };

        // coverting array to ArrayList

        // List l = Arrays.asList(string);
        // System.out.println(" l ======> " + l);
        // l.add("soma");
        // System.out.println(" l ======> " + l);

        // U get UnsupportedOperationException.
        // now create a new Arraylist.

        List<String> l1 = new ArrayList<String>(Arrays.asList(string));
        l1.add("soma");
        System.out.println(" l1 ====> " + l1);

        // converting back to arroy

        String [] sa = new String[l1.size()];
        sa = l1.toArray(sa);

        for(String s : sa){
            System.out.println(s);
        }

    }

}
