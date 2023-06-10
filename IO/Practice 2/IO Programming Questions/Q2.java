import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the path");
        String path = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc2.next();

        noOfOccurances(path, word);

    }

    public static void noOfOccurances(String path, String word) {

        File f = new File(path);
        System.out.println("does file exists : " + f.exists());
        System.out.println("is file : " + f.isFile());
        System.out.println("is directory :" + f.isDirectory());
        int count = 0;

        if (f.exists() && f.isDirectory()) {

            File[] fi = f.listFiles();

            for (File fa : fi) {

                if (fa.exists() && fa.isFile() && fa.getName().endsWith("txt")) {

                    System.out.println("file name :" + fa.getName());

                    LineNumberReader ln = null;
                    String line = "";

                    try {

                        ln = new LineNumberReader(new BufferedReader(new FileReader(fa)));

                        while ((line = ln.readLine()) != null) {

                            if (line.contains(word)) {
                                System.out.println(ln.getLineNumber() + " " + line);
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
