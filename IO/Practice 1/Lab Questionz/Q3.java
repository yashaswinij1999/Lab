import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter the path ");
        String line = sc2.nextLine();

        File f = new File(line);
        System.out.println(f.exists());
        System.out.println(f.isDirectory());
        System.out.println(f.getName());

        FileReader fr = null;

        try {

            if (f.exists() && f.isFile()) {

                System.out.println(f.getName());
                fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);

                String str;

                try {

                    while ((str = br.readLine()) != null) {

                        System.out.println(str);

                    }

                } catch (IOException e) {

                    // TODO: handle exception
                    e.printStackTrace();

                } finally {

                    try {

                        if (fr != null) {
                            fr.close();
                        }

                    } catch (Exception e) {
                        // TODO: handle exception

                        e.printStackTrace();
                    }

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

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }

    }

}
