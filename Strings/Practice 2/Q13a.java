public class Q13a {

    public static void main(String[] args) {

        String s = "accbcca";
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {

        int j = s.length() - 1;
        boolean isPalindrome = true;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
            j--;

        }
        return isPalindrome;

    }

}
