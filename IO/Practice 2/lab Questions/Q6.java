import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// C:/Users/yashu/Desktop/IO txt files/

public class Q6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the path");
        String path = sc.nextLine();

        File f = new File(path);
        System.out.println("does path exists " + f.exists());
        System.out.println("is file " + f.isFile());
        System.out.println("is directory " + f.isDirectory());

        if (f.exists() && f.isDirectory()) {

            BufferedReader br = null;

            File[] fi = f.listFiles();
            for (File fa : fi) {

                if (fa.exists() && fa.isFile() && fa.getName().endsWith("txt")) {

                    System.out.println("file name :" + f.getName());

                    try {

                        br = new BufferedReader(new FileReader(fa));
                        String s;
                        String word = "";
                        int count = 0;
                        int maxCount = 0;
                        int i = 0;
                        int j = 0;
                        List<String> l = new ArrayList<>();
                        String[] split = new String[0];

                        while ((s = br.readLine()) != null) {

                            split = s.split(" ");

                            for (String st : split) {
                                l.add(st);

                            }

                        }

                        for (i = 0; i < l.size(); i++) {

                            count = 1;

                            for (j = i + 1; j < l.size(); j++) {

                                if (l.get(i).equals(l.get(j))) {
                                    count++;
                                }

                            }
                            if (count > maxCount) {
                                maxCount = count;
                                word = l.get(i);
                            }

                        }
                        System.out.println(word + " occurs " + maxCount + " times ");

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
