import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class Q9 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("enter the path");
        String path = sc1.nextLine();

        File f1 = new File(path);
        BufferedReader br = null;
        BufferedWriter bw = null;

        TreeSet<String> ts = new TreeSet<>();
        String line;
        String word = "";

        try {

            if (f1.isFile() && f1.exists() && f1.getName().endsWith(".txt")) {

                br = new BufferedReader(new FileReader(f1));

                while ((line = br.readLine()) != null) {

                    String[] arr = line.split(" ");

                    for (String str : arr) {
                        ts.add(str);
                    }
                    bw = new BufferedWriter(new FileWriter(f1));

                }
            }
            for (String s : ts) {

                word = word + " " + s;
            }

            bw.write(word);
            bw.newLine();

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
