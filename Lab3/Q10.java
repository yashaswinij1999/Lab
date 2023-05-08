public class Q10 {

    public static void main(String[] args) {

        System.out.println("LCM of 2 number = " + isLCM(2,6));

    }

    public static int isLCM(int a, int b) {

        if (a == 0 || b == 0) { 
            return 0;
        }

        int d = a > b ? a : b;
        while (true) {

            if (d % a == 0 && d % b == 0) {
                return d;
            }
            d++;
        }

    }

}
