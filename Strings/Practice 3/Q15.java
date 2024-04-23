
public class Q15 {

    public static void main(String[] args) {

        isSquareRoot(4);

    }

    public static void isSquareRoot(int num) {

        double sqrt = Math.sqrt(num);

        if (sqrt == Math.round(sqrt)) {
            System.out.println("Its is an Integer");
        } else {
            System.out.println("Its not an Integer");
        }
    }
}
