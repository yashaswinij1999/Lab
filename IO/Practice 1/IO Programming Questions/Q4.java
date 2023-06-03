import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter the path ");
        String path = sc1.nextLine();

        System.out.println("Enter the word which needs to be edited");
        String oneWord = sc2.next();

        System.out.println("Enter the word which needs to be replaced");
        String replaceWord = sc2.next();

        replaceOneWithAnother(path, oneWord, replaceWord);

    }

    public static void replaceOneWithAnother(String path, String oneWord, String replaceWord) {

        File f = new File(path);

        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.getName());

        if (f.exists() && f.isDirectory()) {

            File[] fa = f.listFiles();

            for (File fi : fa) {

                if (fi.exists() && fi.isFile() && fi.getName().endsWith("txt")) {

                    BufferedReader br = null;
                    BufferedWriter bw = null;

                    try {

                        br = new BufferedReader(new FileReader(fi));
                        String line;
                        List<String> l = new ArrayList<>();

                        while ((line = br.readLine()) != null) {

                            System.out.println(line);

                            if (line.contains(oneWord)) {
                                line = line.replace(oneWord, replaceWord);
                                l.add(line);
                            } 
                            else {
                                l.add(line);
                            }

                            System.out.println(l);

                        }
                        br.close();
                        br = null;

                        bw = new BufferedWriter(new FileWriter(fi));

                        for (String str : l) {
                            bw.write(str);
                            bw.newLine();
                        }
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

        }

    }
}
