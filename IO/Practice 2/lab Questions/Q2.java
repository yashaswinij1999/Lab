import java.io.File;
import java.util.Scanner;

// taken C:/Users/yashu/Desktop/IO txt files/ as path

public class Q2 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the path");
        String path = sc1.nextLine();

        File f = new File(path);
        System.out.println("does file exists : " + f.exists());
        System.out.println(" f is a file : " + f.isFile());
        System.out.println(" f is directory : " + f.isDirectory());
        System.out.println("file name : " + f.getName());
        System.out.println("file absolute path : " + f.getAbsolutePath());

        File[] fa = f.listFiles();
        for (File fi : fa) {

            System.out.println("file name :" + fi.getName());
            
        }

    }

}
