
public class palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("abtyu"));
        System.out.println(isPalindrome("abcba"));
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }

        }
        return  true;

    }

}
