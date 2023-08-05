public class W4 {

    public static void main(String[] args) {

        String s = "";

        for (int i = 1; i <= 10; i++) {

            int result = (int) (Math.random() * 10);
            s = s + result;

        }
        System.out.println(s);

    }

}
