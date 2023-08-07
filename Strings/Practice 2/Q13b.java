public class Q13b {

    public static void main(String[] args) {

        // swappingUsingThirdVariable(5, 6);
        // swappingUsingAdditionSubtraction(5, 6);
        swappingUsingXor(5, 6);

    }

    public static void swappingUsingThirdVariable(int a, int b) {

        int t = 0;

        System.out.println("a = " + a + " b = " + b + " before swapping ");
        t = a;
        a = b;
        b = t;

        System.out.println("a = " + a + " b = " + b + " after swapping ");
    }

    public static void swappingUsingAdditionSubtraction(int a, int b) {

        System.out.println("a = " + a + " b = " + b + " before swapping ");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b + " after swapping ");

    }

    public static void swappingUsingXor(int a, int b) {

        System.out.println("a = " + a + " b = " + b + " before swapping ");
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("a = " + a + " b = " + b + " after swapping ");

    }

}
