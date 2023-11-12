import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("enter the path");
        String path = sc1.nextLine();

        File f1 = new File(path);
        BufferedReader br = null;

        String line;

        try {

            if (f1.isFile() && f1.exists() && f1.getName().endsWith(".txt")) {

                br = new BufferedReader(new FileReader(f1));

                while ((line = br.readLine()) != null) {

                    System.out.println(line);

                }
            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}