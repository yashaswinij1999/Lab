import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Q10 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the path");
        String path = sc1.nextLine();

        replaceContentsOfTheFile(path);

    }

    public static void replaceContentsOfTheFile(String path) {

        File f = new File(path);
        System.out.println("does file exists " + f.exists());
        System.out.println(" file is file : " + f.isFile());
        System.out.println("is directory " + f.isDirectory());

        BufferedReader br = null;
        BufferedWriter bw = null;

        SortComparator sc = new SortComparator();
        TreeSet<String> l = new TreeSet<>();
        String line = "";
        String[] split = new String[0];
        String word = "";

        if (f.exists() && f.isFile()) {

            try {

                br = new BufferedReader(new FileReader(f));

                while ((line = br.readLine()) != null) {

                    System.out.println(line);
                    split = line.split(" ");

                    for (String s : split) {
                        l.add(s);
                    }
                }

                System.out.println("in sorted manner " + l);
                br.close();

                bw = new BufferedWriter(new FileWriter(f));

                for (String s : l) {
                    word = word + " " + s;
                }
                bw.write(word);
                bw.newLine();

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

class SortComparator implements Comparator {

    public int compare(Object o1, Object o2) {

        if (o1 instanceof String && o2 instanceof String) {

            String s = (String) o1;
            String s1 = (String) o2;

            return s.compareTo(s1);

        }
        throw new IllegalArgumentException("Incorrect Object");

    }

}