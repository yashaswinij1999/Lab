import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter path");
        String path = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter word");
        String word = sc2.next();

        File f = new File(path);
        System.out.println("is file exists " + f.exists());
        System.out.println("is directory " + f.isDirectory());

        BufferedReader br = null;
        String str;

        if (f.exists() && f.isDirectory()) {

            File[] fa = f.listFiles();

            for (File fi : fa) {

                if (fi.exists() && fi.isFile() && fi.getName().endsWith("txt")) {

                    System.out.println("file name = " + fi.getName());

                    try {

                        br = new BufferedReader(new FileReader(fi));
                        int pos = 0;
                        int count = 0;

                        while ((str = br.readLine()) != null) {

                            while ((pos = str.indexOf(word, pos)) != -1) {
                                pos++;
                                count++;
                            }

                        }
                        System.out.println("the word " + word + " ocurrs " + count);

                    } catch (Exception e) {

                        e.printStackTrace();

                    }

                    finally {

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
