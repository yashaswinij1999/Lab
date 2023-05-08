public class Q15 {

    public static void main(String[] args) {

        swap2Ints(14, 28);

    }

    public static void swap2Ints(int a, int b) {

        System.out.println(" a = " + a + " b = " + b + " before swapping ");

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(" a = " + a + " b = " + b + " after swapping ");
    }

}
