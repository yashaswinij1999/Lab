public class Q15 {

    public static void main(String[] args) {

        swapTwoInts(14, 16);

    }

    public static void swapTwoInts(int a, int b) {

        System.out.println(" before swapping a = " + a + " b  = " + b);

        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        System.out.println(" after swapping a = " + a + " b  = " + b);

    }

}
