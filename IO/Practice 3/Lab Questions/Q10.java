import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("enter the path");
        String path = sc1.nextLine();

        System.out.println("enter the word");
        String word = sc2.next();

        File f = new File(path);

        File[] array = f.listFiles();
        BufferedReader br = null;
        String line;

        List<String> l = new ArrayList<>();
        int count = 0;

        try {

            for (File f1 : array) {

                if (f1.exists() && f1.isFile() && f1.getName().endsWith(".txt")) {

                    br = new BufferedReader(new FileReader(f1));

                    while ((line = br.readLine()) != null) {

                        if (line.contains(word)) {

                            String[] arr = line.split(" ");

                            for (String s : arr) {
                                l.add(s);
                            }

                        }

                    }

                }

            }

            for (String str : l) {

                if (str.equals(word)) {
                    count++;
                }

            }

            System.out.println("the word " + word + " ocurrs " + count + " no of times ");

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}
