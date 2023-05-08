public class Q19_20 {

    public static void main(String[] args) {

        System.out.println("isIncreasing = " + isIncreasing(1899));

        int c = 0;

        for (int i = 1; i < 10000; i++) {

            if (isIncreasing(i))
                c++;
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.print("no of times = " + c);
    }

    public static boolean isIncreasing(int n) {

        while (n > 0) {
            int d1 = n % 10;
            n /= 10;

            int d2 = n % 10;
            if (d2 > d1) {
                return false;

            }

        }
        return true;
    }

}
