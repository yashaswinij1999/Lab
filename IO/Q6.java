import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter path");
        String line = sc1.nextLine();

        File f = new File(line);
        BufferedReader br = null;

        if (f.exists() && f.isFile()) {

            try {

                br = new BufferedReader(new FileReader(f));

                String str;
                String[] arr;
                List<String> l;

                while ((str = br.readLine()) != null) {

                    arr = str.split(" ");

                    l = new ArrayList<>(Arrays.asList(arr));
                    System.out.println(l);

                    for (String s : l) {

                        System.out.println(Collections.frequency(l, s));

                    }

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
            }
        }
    }

}
