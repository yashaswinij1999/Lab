public class Q1 {

    public static void main(String[] args) {

        String str = "abcdef";
        System.out.println("length = " + str.length());

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            // System.out.println(c);
        }

        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {

            char ca = c[i];
            System.out.println(ca);
        }
        
        String s2 = str.toUpperCase();
        System.out.println(s2);

        String s1 = "amma";
        String s3 = "Amma";
        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.indexOf("ma"));

    }
}