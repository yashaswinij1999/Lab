
public class Q16 {

    public static void main(String[] args) {

        for (int i = 1; i <= 999; i++) {
            isArmStrong(i);
        }

    }

    public static void isArmStrong(int num) {

        int original = num;
        int r = 0;
        double temp = 0;
        double armStrong = 0;

        while (num > 0) {
            r = num % 10;
            temp = Math.pow(r, 3);
            armStrong = armStrong + temp;
            num /= 10;
        }

        if (armStrong == original) {
            System.out.println("the num " + original + " is armstrong");
        } else {
            System.out.println("the num " + original + " is not armstrong");
        }

    }
}
