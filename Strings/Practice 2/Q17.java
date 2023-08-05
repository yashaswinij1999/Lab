public class Q17 {

    public static void main(String[] args) {

        String s = "i have good name";
        char[] c = s.toCharArray();
        int count = 0;

        for (int i = 0; i < c.length; i++) {

            count = 0;
            for (int j = 0; j < c.length; j++) {

                if (c[i] == c[j]) {
                    count++;
                }

            }

            if (count == 1) {
                System.out.print(c[i]);
            }
        }

    }

}
