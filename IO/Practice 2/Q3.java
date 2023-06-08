import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter path");
        String path = sc1.nextLine();

        printContentsOfFile(path);

    }

    public static void printContentsOfFile(String path) {

        File f = new File(path);
        System.out.println("does file exits : " + f.exists());
        System.out.println("is f is a file : " + f.isFile());
        System.out.println("f is directory " + f.isDirectory());

        if (f.exists() && f.isDirectory()) {

            File[] fa = f.listFiles();

            for (File fi : fa) {

                BufferedReader br = null;

                if (fi.isFile() && fi.isFile() && fi.getName().endsWith("txt")) {

                    try {

                        br = new BufferedReader(new FileReader(fi));
                        String line;

                        while ((line = br.readLine()) != null) {

                            System.out.println(line);
                        }

                    } catch (IOException e) {

                        // TODO: handle exception
                        e.printStackTrace();

                    } finally {

                        try {

                            if (br != null) {
                                br.close();
                            }

                        } catch (Exception e) {

                            // TODO: handle exception
                            e.printStackTrace();

                        }
                    }

                }

            }
        }
    }

}
