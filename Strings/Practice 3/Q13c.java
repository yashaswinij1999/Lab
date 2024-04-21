
public class Q13c {

    public static void main(String[] args) {

        int a = 30;
        int b = 20;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
        
    }
      
}
