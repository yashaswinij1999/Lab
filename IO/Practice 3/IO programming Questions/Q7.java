import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("enter the path");
        String path = sc1.nextLine();

        System.out.println("enter the word");
        String word = sc2.next();

        File f = new File(path);
        BufferedReader br = null;
        String line;

        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.getName());

        File[] array = f.listFiles();
        List<String> l = new ArrayList<>();

        int pos = 0;
        int count = 0;

        try {

            for (File f1 : array) {

                if (f1.exists() && f1.isFile() && f1.getName().endsWith(".txt")) {

                    br = new BufferedReader(new FileReader(f1));
                    count = 0;
                    while ((line = br.readLine()) != null) {

                        while ((pos = line.indexOf(word, pos)) != -1) {

                            pos++;
                            count++;

                        }

                    }
                    System.out.println("the word " + word + " occurs " + count + " no of times " + f1.getName());

                }

            }

            for (String s : l) {
                System.out.println(s);
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
