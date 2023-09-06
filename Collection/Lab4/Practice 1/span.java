import java.util.ArrayList;
import java.util.List;

public class span {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        // l.add(1);
        // l.add(2);
        // l.add(1);
        // l.add(1);
        // l.add(3);

        int[] c = { 1, 1, 2, 4, 5, 8, 9, 6, 8 };
        System.out.println(maxSpan(c));
    }

    public static int maxSpan(int[] nums) {
        int maxSpan = 0;
        int span;
        int j;
        for (int i = 0; i < nums.length; i++) {
            for (j = nums.length - 1; nums[i] != nums[j]; j--)
                ;

            span = 1 + j - i;
            if (span > maxSpan)
                maxSpan = span;
        }
        return maxSpan;
    }

}
