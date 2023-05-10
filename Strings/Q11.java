public class Q11 {

    public static void main(String[] args) {

        String s1 = "happynew";
        String s2 = s1.concat("year");
        System.out.println("s2 == " + s2);

        StringBuilder sb = new StringBuilder(); 
        sb.append(s2);
        sb.reverse();
        String s3 = sb.toString();
        System.out.println("s3 == " + s3);
        

    }

}
