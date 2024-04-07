
public class Q11 {

    public static void main(String[] args) {

        System.out.println(isPalindrome(12331));
    }

    public static boolean isPalindrome(int num) {

        String str = "" + num;

        int i = 0;
        while (i < str.length()) {

            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }

            i++;

        }
        return true;

    }
}
