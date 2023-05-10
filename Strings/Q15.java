public class Q15 {

    public static void main(String[] args) {

        int i = 20;
        System.out.println(Math.sqrt(i));
        double d = Math.sqrt(i);
        if (d == Math.round(d)) {
            System.out.println("Integer");
        } else {
            System.out.println("Not an integer");
        }

    }

}
