import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Q8 {

    public static void main(String[] args) {

        File f = new File("C:/Users/yashu/Desktop/IO txt files/Demo.sita.txt");
        sortedWithOutDuplicates(f);

    }

    public static void sortedWithOutDuplicates(File f) {

        TreeSet<String> st = new TreeSet<>();
        List<String> l = new ArrayList<>();
        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(f));
            String line;

            while ((line = br.readLine()) != null) {

                String[] arr = line.split(" ");

                for (String s : arr) {
                    st.add(s);
                    l.add(s);
                }

            }
            Collections.sort(l);
            System.out.println("sorted withOut duplicates :" + st);
            System.out.println("sorted with duplicates : " + l);

        } catch (IOException e) {

            // TODO: handle exception
            e.printStackTrace();

        } finally {

            try {

                if(br != null){
                    br.close();
                }

            } catch (Exception e) {

                // TODO: handle exception
                e.printStackTrace();

            }
        }
    }
}