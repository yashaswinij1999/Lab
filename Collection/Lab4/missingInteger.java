import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class missingInteger {

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        al.add(9);

        Set<Integer> st = new HashSet();
        int[] arr = new int[2];

        for (int a : al) {

            if (!st.contains(a)) {
                st.add(a);
            } else {
                arr[0] = a;
            }

        }

        for (int i = 1; i <= al.size(); i++) {
            if (!st.contains(i)) {
                arr[1] = i;
            }
        }
        System.out.println(" duplicated number = " + arr[0]);
        System.out.println(" missing number = " + arr[1]);

    }

}
