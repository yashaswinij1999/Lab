import java.io.File;

public class Q8 {

    public static void main(String[] args) {

        File f = new File("C:/Users/yashu/Desktop/Yashu/Lab/IO/Practice 3/Lab Questions");

        File[] ar = f.listFiles();

        for (File f1 : ar) {
            System.out.println(f1.getName());
        }

    }

}
