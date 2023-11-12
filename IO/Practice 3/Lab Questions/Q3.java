import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter the path");
        String path = sc1.nextLine();

        File f = new File(path);
        File[] f1 = f.listFiles();
        FileReader br = null;
        int i;

        try {

            for (File fl : f1) {

                if (fl.exists() && fl.isFile() && fl.getName().endsWith(".txt")) {

                    br = new FileReader(fl);
                    while ((i = br.read()) != -1) {

                        System.out.println((char) i);

                    }

                }

            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        } finally {

            try {

                br.close();

            } catch (Exception e) {

                // TODO: handle exception
                e.printStackTrace();

            }

        }

    }

}
