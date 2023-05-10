public class TestMath {

    public static void main(String[] args) {

        System.out.println(" Math.sqrt = " + Math.sqrt(4));
        System.out.println(" Math.cbrt() = " + Math.cbrt(8));

        for (int i = 0; i < 1; i++) {
            int random = (int) (Math.random() * 10);
            System.out.println("Math.random() = " + random);
        }

    }

}
