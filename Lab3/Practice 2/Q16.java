public class Q16 {

    public static void main(String[] args) {

        for (int i = 0; i <= 999; i++) {

            int n = i;
            int temp = 0;
            int armstrong = 0;
            int original = n;

            while (n > 0) {

                temp = n % 10;
                temp = (int) (Math.pow(temp, 3));
                armstrong = temp + armstrong;
                n /= 10;
            }
            if (armstrong == original) {
                System.out.println("is armstrong " + i);
            } else {
                System.out.println("is not armstrong " + i);
            }

        }
    }

}
