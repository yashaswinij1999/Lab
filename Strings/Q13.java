public class Q13 {

    public static void main(String[] args) {

        int a = 30;
        int b = 20;
        int temp = 0;
        System.out.println("a = " + a + " b = " + b + " before swapping " );

        //  using temp variable
        temp = a;
        a = b;
        b = temp;
         System.out.println("a = " + a + " b = " + b + " after swapping " );

        // addition &  subtraction approach
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b + " after swapping " );

        // swapping using xor (^) approach
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("a = " + a + " b = " + b + " after swapping " );

        
        

    }
    
}
