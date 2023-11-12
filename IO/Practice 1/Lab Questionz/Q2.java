import java.io.File;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println(" Enter the path ");
        String line = sc2.nextLine();

        System.out.println("Path = " + line);

        File f = new File(line);
        System.out.println("file.exists() = " + f.exists());
        System.out.println("f.isDirectory() = " + f.isDirectory());
        System.out.println("f.length() = " + f.length());
        System.out.println("f.getAbsolutePath() = " + f.getAbsolutePath());
        System.err.println("f.getName() = " + f.getName());

        File[] fa = f.listFiles();

        for (File fi : fa) {

            System.out.println("fi.getName() = " + fi.getName());
            
        }

    }

}
