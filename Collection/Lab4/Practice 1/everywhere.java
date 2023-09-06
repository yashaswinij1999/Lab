import java.util.ArrayList;
import java.util.List;

public class everywhere {

    public static void main(String[] args) {

        int [] arr ={1,1,2,3};

        int value = 1;
        boolean result = isValueEveryWhere(arr, value);

        System.out.println("is value everywhere = " + result);
    }

    public static boolean isValueEveryWhere(int [] arr, int value) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != value && arr[i+1] != value)
                return false;
        }
        return true;

    }
}
