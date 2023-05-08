public class Q17_18 {

    public static void main(String[] args) {

        System.out.println(" containSameDigits = " + containSameDigits(112, 125));
        System.out.println(" numOfOccurance = " + numOfOccurance(144478, 4) + " times ");
    }

    public static boolean containSameDigits(int a, int b) {

        int k = a;
        int d = 0;

        while (k > 0) {
            d = k % 10;
            if (numOfOccurance(a, d) != numOfOccurance(b, d)) {
                return false;
            }
            k /= 10;
        }
        return true;

    }

    public static int numOfOccurance(int num, int n) {

        int r = 0;
        int count = 0;

        while (num > 0) {
            r = num % 10;
            if (r == n) {
                count++;
            }
            num /= 10;
        }
        return count;

    }

}
