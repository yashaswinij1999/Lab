public class Q18 {

    public static void main(String[] args) {

        System.out.println("the given number occurs " + noOfOccurance(5124441, 4) + " times ");

    }

    public static int noOfOccurance(int num, int n) {

        int r = 0;
        int count = 0;

        while (num > 0) {

            r = num % 10;

            if (r == n) {
                count++;
            }
            num = num /= 10;

        }
        return count;

    }

}
