public class Q14 {

    public static void main(String[] args) {

        int a = 125;
        int b = 14;
        int[] add = { 1, 5, 8, 9, 8 };
        double[] add1 = { 12.2, 1.4, 5.8, 9.5 };
        Complex c1 = new Complex(4, 9);
        Complex c2 = new Complex(5, 10);

        System.out.println(" Ability to add 2 ints = " + add2Ints(a, b));
        System.out.println(" Ability to add N ints = " + addNInts(add));
        System.out.println(" Ability to add N doubles = " + addNdoubles(add1));
         add2Complex(c1 ,c2);

    }

    public static int add2Ints(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int addNInts(int[] add) {
        int sum = 0;

        for (int i = 0; i < add.length; i++) {

            sum += add[i];
        }
        return sum;

    }

    public static double addNdoubles(double[] add1) {

        double sum = 0;

        for (int i = 0; i < add1.length; i++) {

            sum += add1[i];
        }
        return sum;
    }

    public static void add2Complex(Complex c1, Complex c2){

        int realNumber = c1.realNumber + c2.realNumber;
        int imaginaryNumber = c1.imaginaryNumber + c2.imaginaryNumber;

        Complex c3 = new Complex(realNumber, imaginaryNumber);
        System.out.println(" realNumber = " + c3.realNumber);
        System.out.println(" imaginaryNumber = " + c3.imaginaryNumber);

    }
}
