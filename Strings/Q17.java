import java.util.Scanner;

public class Q17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input");
        String s1 = sc.next();

        char[] ca = s1.toCharArray();

        for (int i = 0; i < ca.length; i++) {

            int count = 0;
            char a = ca[i];

            for (int j = 0; j < ca.length; j++) {

                char b = ca[j];

                if (a == b) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(a);
            }
        }

    }

}
