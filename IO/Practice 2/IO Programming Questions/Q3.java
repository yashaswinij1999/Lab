import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// C:/Users/yashu/Desktop/Yashu/Lab/IO/Practice 1/IO Programming Questions/IOProgrammingQuestions.txt

public class Q3 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the path");
        String path = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the word which has to be replaced");
        String replaceWord = sc2.next();

        System.out.println("Enter the newly added word ");
        String newWord = sc2.next();

        replaceOneWithAnother(path, replaceWord, newWord);

    }

    public static void replaceOneWithAnother(String path, String replaceWord, String newWord) {

        File f = new File(path);
        System.out.println("does file exists " + f.exists());
        System.out.println(" file is file : " + f.isFile());
        System.out.println("is directory " + f.isDirectory());

        BufferedReader br = null;
        BufferedWriter bw = null;
        List<String> l = new ArrayList<>();
        String line = "";

        if (f.exists() && f.isFile()) {

            try {

                br = new BufferedReader(new FileReader(f));

                while ((line = br.readLine()) != null) {

                    // System.out.println(line);
                    if (line.contains(replaceWord)) {
                        line = line.replace(replaceWord, newWord);
                    }
                    l.add(line);
                }
                br.close();

                bw = new BufferedWriter(new FileWriter(f));
                for (String s : l) {
                    bw.write(s);
                    bw.newLine();
                }

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
