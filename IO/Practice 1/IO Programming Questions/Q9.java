import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q9 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter the path");
        String path = sc1.nextLine();

        printTheContentsInSortedManner(path);

    }

    public static void printTheContentsInSortedManner(String path) {

        File f = new File(path);
        System.out.println("does file exists = " + f.exists());
        System.out.println("file is a file = " + f.isFile());
        System.out.println("is directory = " + f.isDirectory());

        if (f.exists() && f.isFile()) {

            BufferedReader br = null;
            BufferedWriter bw = null;

            try {

                br = new BufferedReader(new FileReader(f));
                Set<String> s = new TreeSet<>();
                String line;
                String word = "";

                while ((line = br.readLine()) != null) {

                    String[] arr = line.split(" ");

                    for (String str : arr) {
                        s.add(str);
                    }

                }
                br.close();
                br = null;

                System.out.println(s);

                bw = new BufferedWriter(new FileWriter(f));

                for (String ts : s) {
                    word = word + " " + ts;

                }
                bw.write(word);
                bw.newLine();
                bw.flush();

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
