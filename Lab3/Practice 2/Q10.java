public class Q10 {

    public static void main(String[] args) {

        System.out.println(isPalindrome(1221));

    }

    public static boolean isPalindrome(int n) {

        int r = 0;
        int s = 0;
        int temp = n;

        while (n > 0) {

            r = n % 10;
            s = (s * 10) + r;
            n /= 10;

        }
        if (temp == s) {
            return true;
        } else {
            return false;
        }
    }

}
