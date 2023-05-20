import java.util.ArrayList;
import java.util.List;

public class Q10a {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList();
        l.add(1);
        l.add(9);
        l.add(2);
        l.add(1);
        l.add(2);
        System.out.println(isProductEven(l));

    }

    public static boolean isProductEven(List<Integer> l) {

        for (int i = 0; i < l.size(); i++) {

            for (int j = 0; j < l.size(); j++) {

                if (l.get(i) * l.get(j) % 2 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
