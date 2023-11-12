import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Please Enter the Path");
        String path = sc1.nextLine();

        System.out.println("Please enter the word");
        String word = sc2.next();

        System.out.println("Please enter replace word");
        String replaceWord = sc2.next();

        replaceAllOccurancesWithWord(path, word, replaceWord);

    }

    public static void replaceAllOccurancesWithWord(String path, String word, String replaceWord) {

        File f = new File(path);
        System.out.println("does file exits " + f.exists());
        System.out.println("is file = " + f.isFile());
        System.out.println("is directory = " + f.isDirectory());

        if (f.exists() && f.isFile() && f.getName().endsWith("txt")) {

            BufferedReader br = null;
            BufferedWriter bw = null;
            String line;

            try {

                br = new BufferedReader(new FileReader(f));
                List<String> l = new ArrayList<>();

                while ((line = br.readLine()) != null) {

                    if (line.contains(word)) {
                        line = line.replace(word, replaceWord);
                        l.add(line);

                    } else {
                        l.add(line);
                    }

                }
                br.close();
                br = null;

                bw = new BufferedWriter(new FileWriter(f));

                for (String str : l) {
                    bw.write(str);
                    bw.newLine();
                }
                bw.flush();

            } catch (IOException e) {

                // TODO: handle exception
                e.printStackTrace();

            }

            finally {

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
