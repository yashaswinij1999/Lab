
public class Q1 {

    public static void main(String[] arr) {

        try {
            System.out.println(arr[0]);
        } catch (RuntimeException e) {
            // TODO: handle exception
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("is this executed");

    }

}
