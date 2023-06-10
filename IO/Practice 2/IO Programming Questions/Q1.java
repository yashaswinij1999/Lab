import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

// C:/Users/yashu/Desktop/IO txt files/Demo.sita.txt
public class Q1 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the path");
        String path = sc1.nextLine();

        readTheContens(path);

    }

    public static void readTheContens(String path) {

        File f = new File(path);
        System.out.println("does file exists:" + f.exists());
        System.out.println("f is file " + f.isFile());

        if (f.exists() && f.isFile()) {

            BufferedReader br = null;

            try {

                br = new BufferedReader(new FileReader(f));
                String line;

                while ((line = br.readLine()) != null) {

                    System.out.println(line);

                }

            } catch (Exception e) {

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