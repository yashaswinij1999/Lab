import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter the path");
        String path = sc1.nextLine();

        System.out.println("Enter the search string");
        String word = sc2.next();

        searchWordAndSort(path, word);

    }

    public static void searchWordAndSort(String path, String word) {

        File f = new File(path);
        System.out.println("does file exits " + f.exists());
        System.out.println("is a file " + f.isFile());
        System.out.println("is directory = " + f.isDirectory());
        System.out.println("file name =" + f.getName());

        if (f.exists() && f.isDirectory()) {

            File[] fi = f.listFiles();

            for (File fa : fi) {

                BufferedReader br = null;
                Set<String> t;

                if (fa.exists() && fa.isFile()) {

                    try {

                        br = new BufferedReader(new FileReader(fa));
                        String line;
                        t = new TreeSet<>();

                        while ((line = br.readLine()) != null) {

                            if (line.contains(word)) {

                                String[] split = line.split(" ");

                                for (String s : split) {
                                    t.add(s);
                                }

                            }

                        }
                        System.out.println(t);

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
