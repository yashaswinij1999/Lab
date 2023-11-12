import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter the path");
        String path = sc1.nextLine();

        System.out.println("Enter the search string");
        String word = sc2.next();

        

        occurancesOfString(path, word);

    }

    public static void occurancesOfString(String path, String word) {

        File f = new File(path);
        System.out.println("does file exits " + f.exists());
        System.out.println("is a file " + f.isFile());
        System.out.println("is directory = " + f.isDirectory());
        System.out.println("file name =" + f.getName());

        if (f.exists() && f.isDirectory()) {

            File[] fi = f.listFiles();

            for (File fa : fi) {

                BufferedReader br = null;

                if (fa.exists() && fa.isFile() && fa.getName().endsWith("txt")) {

                    try {

                        br = new BufferedReader(new FileReader(fa));
                        String line;
                        int pos = 0;
                        int count = 0;

                        while ((line = br.readLine()) != null) {

                            while ((pos = line.indexOf(word, pos)) != -1) {

                                count++;
                                pos++;

                            }

                        }
                        
                        System.out.println("the word " + word + " occurs " + + count + " no of times in a file name " + fa.getName() );

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
