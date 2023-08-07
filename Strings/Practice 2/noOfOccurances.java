public class noOfOccurances {

    public static void main(String[] args) {

        String s1 = "ramaramaramarai";
        String s2 = "ra";

        int count = 0;
        int pos = 0;

        if (s1 == null || s2 == null) {
            return;
        }

        if (!s1.contains(s2)) {
            return;
        }

        if (s1.length() < s2.length()) {
            return;
        }

        while ((pos = s1.indexOf(s2, pos)) != -1) {

            pos++;
            count++;

        }

        System.out.println("the no of occurances of s2 " + s2 + " in s1 " + s1 + " " + count + " no of times ");

    }

}