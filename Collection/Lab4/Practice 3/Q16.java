import java.util.ArrayList;
import java.util.List;

public class Q16 {

    public static int findSingleElement(ArrayList<Integer> nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(8);
        numbers.add(6);
        numbers.add(3);
        numbers.add(2);
        numbers.add(8);
        numbers.add(6); // 8 appears only once

        int singleElement = findSingleElement(numbers);
        System.out.println("The element that appears only once is: " + singleElement); // Output: 8
    }

}
