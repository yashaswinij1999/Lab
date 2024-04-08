
public class Q19 {

    public static void main(String[] args) {

        System.out.println(isIncreasing(9916));

        int c = 0;
        for (int i = 0; i < 10000; i++) {
            if (isIncreasing(i)) {
                System.out.println(i);
                c++;
            }

        }
        System.out.println();
        System.out.print("no of times = " + c);
    }

    public static boolean isIncreasing(int num) {

        int d1, d2;
        boolean increasing = true;

        while (num > 0) {

            d1 = num % 10;
            num /= 10;
            d2 = num % 10;

            if (d2 > d1) {
                return increasing = false;
            }

        }

        return increasing;

    }

}
