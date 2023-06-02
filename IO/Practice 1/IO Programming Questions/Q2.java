import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter the path");
        String path = sc1.nextLine();

        System.out.println("Enter the search string");
        String word = sc2.next();

        searchString(path, word);

    }

    public static void searchString(String path, String word) {

        File f = new File(path);
        System.out.println("does file exits " + f.exists());
        System.out.println("is a file " + f.isFile());
        System.out.println("is directory = " + f.isDirectory());
        System.out.println("file name =" + f.getName());

        if (f.exists() && f.isDirectory()) {

            File[] fi = f.listFiles();

            for (File fa : fi) {

                LineNumberReader ln = null;

                if (fa.exists() && fa.isFile()) {

                    try {

                        ln = new LineNumberReader(new BufferedReader(new FileReader(fa)));
                        String line;

                        while ((line = ln.readLine()) != null) {

                            if (line.contains(word)) {
                                System.out.println(line);
                            }

                        }

                    } catch (IOException e) {

                        // TODO: handle exception
                        e.printStackTrace();

                    } finally {

                        try {

                            if (ln != null) {
                                ln.close();
                            }

                        } 
                        catch (Exception e) {

                            // TODO: handle exception
                            e.printStackTrace();
                            
                        }
                    }

                }
            }
        }

    }
}
