import java.io.File;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter the path");
        String path = sc1.nextLine();

        File f = new File(path);
        System.out.println("check if file exixts = " + f.exists());
        System.out.println("check if isFile : " + f.isFile());
        System.out.println("if is directory : " + f.isDirectory());
        System.out.println("length of the file : " + f.length());
        System.out.println("get absolute path :" + f.getAbsolutePath());
        System.out.println("name of the file : " + f.getName());

        File[] array = f.listFiles();

        for (File f1 : array) {

            System.out.println(f1.getName());

        }

    }

}