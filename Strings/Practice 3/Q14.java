
public class Q14 {

    public static void main(String[] args) {

        Complex c1 = new Complex(10, 4);
        Complex c2 = new Complex(4, 5);
        addComplexNumbers(c1, c2);

    }

    public static void addComplexNumbers(Complex c1, Complex c2) {

        int realNumber = c1.real + c2.real;
        int imaginary = c1.imaginary + c2.imaginary;
        Complex c3 = new Complex(realNumber, imaginary);
        System.out.println("realNumber " + c3.real + " imaginary " + c3.imaginary);

    }

}
