import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

public class Q10a {

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList();
        l.add(11);
        l.add(3);
        l.add(7);
        l.add(9);
        l.add(9);
        l.add(9);

        boolean result = isProductEven(l);
        System.out.println(" isProductEven = " + result);

    }

    public static boolean isProductEven(ArrayList<Integer> l) {

        for (int i = 0; i < l.size(); i++) {

            int a = l.get(i);

            for (int j = 0; j < l.size(); j++) {

                if (l.get(i) * l.get(j) % 2 == 0) {

                    return true;
                }
            }
        }
        return false;

    }

}
