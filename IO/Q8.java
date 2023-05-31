import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Q8 {

    public static void main(String[] args) {

        File f = new File("C:/Users/yashu/Desktop/sorted.txt");
        List<String> l;
        Set<String>s ;
        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(f));

            if (f.exists() && f.isFile()) {

                String line;
                String[] arr;

                while ((line = br.readLine()) != null) {

                    // sorted with duplicates
                    arr = line.split(" ");
                    Arrays.sort(arr);
                    l = new ArrayList<>(Arrays.asList(arr));

                    for (String str : l) {

                        System.out.println(str);

                    }

                }
            }
        } catch (IOException e) {

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
