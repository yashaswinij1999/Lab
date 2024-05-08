
public class Q5 {

    public static void main(String[] args) {

        try {
            System.out.println("going to use throws");
            if (1 == 1) {
                throw new MyException("null pointer");
            }

        } catch (Exception e) {
            System.out.println("in main()->catch() msg = " + e.getMessage());
            e.printStackTrace();
        }
    }

}

class MyException extends Exception {
    //what should be coded in this class? 

    public MyException() {
    }

    public MyException(String msg) {
        super(msg); // why do we do this? 
    }
}
