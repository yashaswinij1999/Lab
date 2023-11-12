import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("enter the path");
        String path = sc1.nextLine();

        System.out.println("enter the search string");
        String word = sc2.next();

        BufferedReader br = null;
        File f = new File(path);
        String line;
        List<String> l = new ArrayList<>();

        try {

            if (f.isFile() && f.exists() && f.getName().endsWith(".txt")) {

                br = new BufferedReader(new FileReader(f));

                while ((line = br.readLine()) != null) {

                    if (line.contains(word)) {

                        String[] arr = line.split(" ");

                        for (String s : arr) {

                            l.add(s);
                            Collections.sort(l);
                        }

                    }

                }

            }
            System.out.println(l);

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
