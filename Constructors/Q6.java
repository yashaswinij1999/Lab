public class Q6 {

    public static void main(String[] args) {

        String str = "blah";
        String s1 = str.toUpperCase();
        System.out.println("str.toUpperCase() = " + s1);

        str = " blah ";
        String s2 = str.trim();
        System.out.println("s2.length() = " + s2.length());

        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println("s3 == s4 = " +  (s3 == s4)); // do you understand the output?
        System.out.println("s3.equals(s4) = " + s3.equals(s4));

        String s5 = "abc";
        System.out.println("s3 == s5 = " + (s3 == s5));
        System.out.println("s3.equals(s5) = " +  s3.equals(s5));

        String s6 = "abc";
        System.out.println("(s5 == s6) = " + (s5 == s6));
        System.out.println("(s5.equals(s6)) = " + (s5.equals(s6)));

    }

}
