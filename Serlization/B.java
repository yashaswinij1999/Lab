import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class B {

    public static void main(String[] args) {

        File f = new File("C:/Users/yashu/Desktop/Yashu/Lab/Serlization/Demo.java");

       try {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
        int c = in.read();
        
        System.out.println((char)c);

        
       } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
        
       }
        
    }
    
}
