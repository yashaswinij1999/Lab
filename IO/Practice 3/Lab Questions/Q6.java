import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the path");
        String path = sc1.nextLine();

        File f = new File(path);
        BufferedReader br = null;
        String line = "";
        String[] arr = null;
        List<String> l = new ArrayList<>();

        try {

            if (f.isFile() && f.exists() && f.getName().endsWith("txt")) {

                br = new BufferedReader(new FileReader(f));

                while ((line = br.readLine()) != null) {

                    arr = line.split(" ");

                    for (String s : arr) {
                        l.add(s);
                    }

                }

            }

            for (String str : l) {
                int i = Collections.frequency(l, str);
                System.out.println("the word " + str + " occurs " + i + " no of times ");
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

}
