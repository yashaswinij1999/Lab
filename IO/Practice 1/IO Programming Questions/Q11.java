import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter source");
        String source = sc1.nextLine();

        System.out.println("Enter destination");
        String destination = sc1.nextLine();

        File f = new File(source);
        System.out.println("does file exists " + f.exists());
        System.out.println(" is a file directory " + f.isDirectory());

        if (f.exists() && f.isDirectory()) {

            File[] fa = f.listFiles();

            for (File fi : fa) {

                if (fi.exists() && fi.isFile() && fi.getName().endsWith("txt")) {

                    System.out.println(" name of the file  = " + fi.getName());
                    System.out.println("absolutePath = " + fi.getAbsolutePath());
                    String outDestination = destination + "/" + fi.getName();
                    System.out.println("outDeoutDestination = " + outDestination);
                    copy(fi.getAbsolutePath(), outDestination);
                }

            }

        }
    }

    public static void copy(String source, String destination) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {

            br = new BufferedReader(new FileReader(source));
            bw = new BufferedWriter(new FileWriter(destination));
            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);
                bw.write(line);
                bw.newLine();

            }
            br.close();
            br = null;
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
