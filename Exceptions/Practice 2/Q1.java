public class Q1 {

    public static void main(String[] args) {

        try {

            int[] arr = new int[10];

            System.out.println("Welcome");
            System.out.println(arr[11]);

        } catch (RuntimeException e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}