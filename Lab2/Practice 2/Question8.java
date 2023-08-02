public class Question8 {

    public static void main(String[] args) {

        evenOrOdd(9);

    }

    public static void evenOrOdd(int num) {

        for (int i = 1; i <= num; i++) {

            if (num % 2 == 0) {
                System.out.println("num is even " + "shamboo");
            } else {
                System.out.println("num is even " + "govinda");
            }

        }

    }

}
