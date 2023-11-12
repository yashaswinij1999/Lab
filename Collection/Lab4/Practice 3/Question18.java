import java.util.ArrayList;
import java.util.List;

public class Question18 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        int TotalSum = 0;
        int sum = 0;

        for (int i = 0; i < l.size(); i++) {

            sum = 0;
            for (int j = i + 1; j < l.size(); j++) {

                sum += l.get(i) + l.get(j);

                if (sum > TotalSum) {
                    TotalSum = sum;
                }

            }

        }

        System.out.println("subArray Containing large sum = " + TotalSum);

    }

}
