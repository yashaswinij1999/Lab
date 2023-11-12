import java.io.File;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter path");
        String line = sc1.nextLine();

        File f = new File(line);

        if (f.exists() && f.isDirectory()) {

            File[] fa = f.listFiles();

            for (File fi : fa) {

                if (fi.isFile() && fi.exists() && fi.getName().endsWith("txt")) {

                    System.out.println("files name that ends with txt = " + fi.getName());

                }
            }

        }

    }

}
