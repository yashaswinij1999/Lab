import java.io.File;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter the path");
        String path = sc1.nextLine();

        File f = new File(path);
        File[] array = f.listFiles();

        for (File f1 : array) {

            if (f1.isFile() && f1.exists() && f1.getName().endsWith(".txt")) {

                System.out.println(f1.getName());

            }

        }

    }

}
