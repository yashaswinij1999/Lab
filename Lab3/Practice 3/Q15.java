
public class Q15 {

    public static void main(String[] args) {

        swapInteger(5, 6);

    }

    public static void swapInteger(int a, int b) {

        System.out.println("the value of a " + a + " b " + b + " before swapping ");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("the value of a " + a + " b " + b + " after swapping ");
    }
}
