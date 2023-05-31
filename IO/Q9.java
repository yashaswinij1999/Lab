import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Q9 {

    public static void main(String[] args) {

        File f = new File("C:/Users/yashu/Desktop/sorted.txt");
        Set<String> s;
        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(f));

            if (f.exists() && f.isFile()) {

                String line;
                String[] arr;

                while ((line = br.readLine()) != null) {

                    // sorted withOut duplicates
                    arr = line.split(" ");
                    s = new TreeSet<>();

                    for (String str : arr) {

                        s.add(str);

                    }
                    System.out.println(s);

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
