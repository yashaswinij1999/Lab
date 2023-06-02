import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the path");
        String path = sc1.nextLine();

        readTheContents(path);

    }

    public static void readTheContents(String path) {

        File f = new File(path);
        BufferedReader br = null;
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.getName());

        if (f.exists() && f.isDirectory()) {

            File[] fa = f.listFiles();

            for (File fi : fa) {

                if (fi.exists() && fi.isFile() && fi.getName().endsWith("txt")) {

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