
public class Q18 {

    public static void main(String[] args) {

        noOfDigits(226123, 2);

    }

    public static void noOfDigits(int num, int target) {

        int r = 0;
        int count = 0;

        while (num > 0) {

            r = num % 10;

            if (r == target) {
                count++;
            }
            num /= 10;

        }
        System.out.println("the number " + target + " contains " + count + " times ");

    }

}
