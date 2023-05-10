public class Q12 {

    public static void main(String[] args) {
        
        String s1 = "Welcome";
        String s2 = s1.charAt(s1.length() -1) + s1.substring(1, s1.length() - 1) + s1.charAt(0);
        System.out.println("s2 ==" + s2);
    }
    
}
