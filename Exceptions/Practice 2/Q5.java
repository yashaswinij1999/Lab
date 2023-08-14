public class Q5 {

    public static void main(String[] args) {

        try {

            if (1 == 1)
                throw new MyException("this is my exception");

        } catch (Exception e) {

            // TODO: handle exception
            System.out.println("in main()->catch() msg = " + e.getMessage());

            e.printStackTrace();

        }

    }

}

class MyException extends Exception {

    public MyException() {
    }

    public MyException(String msg) {
        super(msg);
    }
}