public class Math {

    public static void main(String[] args) {

        int a = 15;
        int b = 20;
        int[] arr = { 1, 9, 5, 6, 5 };
        double[] ar = { 1, 1, 5.1, 6.3, 8.9 };
        Complex c1 = new Complex(4, 8);
        Complex c2 = new Complex(9, 18);

        add2Ints(a, b);
        addNInts(arr);
        addNDoubles(ar);
        add2ComplexNumber(c1, c2);

    }

    public static void add2Ints(int a, int b) {

        int c = a + b;
        System.out.println("the sum of 2 ints = " + c);

    }

    public static void addNInts(int[] arr) {

        int sum = 0;

        for (int x : arr) {
            sum += x;
        }
        System.out.println("the sum of  N Ints " + sum);
    }

    public static void addNDoubles(double[] ar) {

        double sum = 0;

        for (double d : ar) {
            sum += d;
        }
        System.out.println("the sum of  N doubles " + sum);

    }

    public static void add2ComplexNumber(Complex c1, Complex c2) {

        int realNumber = c1.realNumber + c2.realNumber;
        int imaginary = c1.imaginary + c2.imaginary;

        Complex c3 = new Complex(realNumber, imaginary);
        System.out.println("c3.realNumber = " + c3.realNumber);
        System.out.println("c3.imaginaryNumber = " + c3.imaginary);

    }

}
