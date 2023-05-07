public class Question8 {

    public static void main(String[] args) {

        isEvenOrOdd(5);

    }

    public static void isEvenOrOdd(int n) {

        for (int i = 1; i <= n; i++) {

            if (n % 2 == 0) {
                System.out.println("Shamboo");
            } else {
                System.out.println("Govinda");
            }
        }
    }

}
