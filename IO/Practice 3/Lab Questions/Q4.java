import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter the existed path");
        String path1 = sc1.nextLine();

        System.out.println("enter the new path");
        String path2 = sc2.nextLine();

        File f1 = new File(path1);
        File f2 = new File(path2);
        BufferedReader fr = null;
        BufferedWriter fw = null;
        int i = 0;
        char c;
        String line = "";
        String data = "";

        try {

            if (f1.exists() && f1.isFile() && f1.getName().endsWith(".txt") && f2.exists() && f2.isFile()
                    && f2.getName().endsWith(".txt")) {

                fr = new BufferedReader(new FileReader(f1));
                fw = new BufferedWriter(new FileWriter(f2));

                while ((line = fr.readLine()) != null) {
                    System.out.println(line);
                    fw.write(line);
                    fw.flush();
                }

            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        } finally {

            try {

                if (fr != null) {
                    fr.close();
                }

            } catch (Exception e) {

                // TODO: handle exception
                e.printStackTrace();

            }
            try {

                if (fw != null) {
                    fw.close();
                }

            } catch (Exception e) {

                // TODO: handle exception
                e.printStackTrace();

            }

        }

    }

}
