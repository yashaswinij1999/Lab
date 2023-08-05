public class Q7 {

    public static void main(String[] args) {

        String[] colurs = { "red", "black", "white", "yellow", "orange" };

        for (int i = 0; i < colurs.length; i++) {

            int x = (int) (Math.random() * colurs.length);
            System.out.println(colurs[x]);

        }

    }

}
