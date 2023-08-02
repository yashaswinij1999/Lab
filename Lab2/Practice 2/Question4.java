public class Question4 {

    public static void main(String[] args) {

        printTheMultiplicationTables(2, 10);

    }

    public static void printTheMultiplicationTables(int a, int b) {

        int smallestNumber = 0;
        int largestNumber = 0;

        if (a < b) {
            largestNumber = b;
            smallestNumber = a;
        } else {
            largestNumber = a;
            smallestNumber = b;
        }

        for (int i = 1; i <= largestNumber; i++) {

            System.out.println(smallestNumber + " * " + i + " = " + smallestNumber * i);

        }
    }
}
