import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

// C:/Users/yashu/Desktop/Yashu/Lab/IO/Practice 1/IO Programming Questions

public class Q4 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter existing file");
        String existingFilePath = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter non existing file ");
        String nonExistingFile = sc1.nextLine();

        readAndWrite(existingFilePath, nonExistingFile);

    }

    public static void readAndWrite(String existingFilePath, String nonExistingFile) {

        File f = new File(existingFilePath);
        System.out.println("does file exits : " + f.exists());
        System.out.println("is f is a file : " + f.isFile());
        System.out.println("f is directory " + f.isDirectory());

        if (f.exists() && f.isDirectory()) {

            File[] fa = f.listFiles();

            for (File fi : fa) {

                BufferedReader br = null;
                BufferedWriter bw = null;

                if (fi.exists() && fi.isFile() && fi.getName().endsWith("txt")) {

                    try {

                        br = new BufferedReader(new FileReader(fi));
                        bw = new BufferedWriter(new FileWriter(nonExistingFile));

                        String line;

                        while ((line = br.readLine()) != null) {

                            System.out.println(line);
                            bw.write(line);
                            bw.newLine();

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

                        try {

                            if (bw != null) {
                                bw.close();
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
