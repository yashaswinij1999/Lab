import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter the path");
        String path = sc1.nextLine();

        File f = new File(path);

        if (f.exists() && f.isDirectory()) {

            System.out.println(f.isDirectory());

            File[] fi = f.listFiles();

            for (File fa : fi) {

                if (fa.exists() && fa.isFile() && fa.getName().endsWith("txt")) {

                    System.out.println(f.getName());
                    BufferedInputStream bi = null;
                    int number;
                    List<Integer> l;
                    int average = 0;

                    try {

                        bi = new BufferedInputStream(new FileInputStream(fa));
                        l = new ArrayList<>();

                        while ((number = (int) bi.read()) != -1) {

                            l.add(number);

                        }
                        for (int x : l) {
                            average = x / l.size();
                        }
                        System.out.println("average = " + average);

                    } catch (IOException e) {

                        // TODO: handle exception
                        e.printStackTrace();

                    } finally {

                        try {

                            if (bi != null) {
                                bi.close();
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
