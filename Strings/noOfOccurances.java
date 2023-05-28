/* if String s1 = “ramaramaramama” ; String s2 = “ma”; No of occurrences of s2 in s1; */

public class noOfOccurances {

    public static void main(String[] args) {

        String s1 = "ramaramaramarai";
        String s2 = "ra";

        int pos = 0;
        int count = 0;

        if (s1 == null || s2 == null) {
            return;
        }

        if (!s1.contains(s2)) {
            return;
        }

        String s3 = s1.trim();
        String s4 = s2.trim();

        if (!s3.contains(s4)) {
            return;
        }

        if (s1.length() < s2.length()) {
            return;
        }

        while ((pos = s1.indexOf(s2, pos)) != -1) {

            count++;
            pos++;

        }
        System.out.println(" no of times s2 " + s2 + " occurs " + count + " no of times ");

    }

}
