import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("enter the path");
        String path = sc1.nextLine();
        File f = new File(path);

        System.out.println("enter the word");
        String word = sc2.next();

        System.out.println("enter the replaced word");
        String replaceWord = sc2.next();

        BufferedReader br = null;
        BufferedWriter bw = null;

        String line;
        List<String> l = new ArrayList<>();

        int pos;

        try {

            if (f.isFile() && f.exists() && f.getName().endsWith("txt")) {

                br = new BufferedReader(new FileReader(f));

                while ((line = br.readLine()) != null) {

                    if (line.contains(word)) {

                        while ((pos = line.indexOf(word)) != -1) {

                            line = line.replace(word, replaceWord);
                            pos++;
                            l.add(line);

                        }

                    } else {
                        l.add(line);
                    }
                    bw = new BufferedWriter(new FileWriter(f));

                }

            }

            for (String s : l) {

                bw.write(s);
                bw.newLine();

            }

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
