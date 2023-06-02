public class noOfOccuranceofEachCharacterInString {

    public static void main(String[] args) {

        String s = "mogamboo";
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            arr[c - 'a']++;

        }

        for (int i = 0; i < arr.length; i++) {

            System.out.println((char) ('a' + i) + " " + " occrances " + arr[i]);
        }
    }

}
