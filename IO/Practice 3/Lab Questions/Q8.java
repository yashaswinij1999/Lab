import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q8 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the path");

        String path = sc1.nextLine();

        File f = new File(path);
        BufferedReader br = null;
        String line;
        TreeSet<String> st = new TreeSet<>();
        List<String> l = new ArrayList<>();
        String[] arr = new String[st.size()];

        sortOnAlphabetsComparator sa = new sortOnAlphabetsComparator();

        try {

            if (f.exists() && f.isFile() && f.getName().endsWith("txt")) {

                br = new BufferedReader(new FileReader(f));

                while ((line = br.readLine()) != null) {

                    arr = line.split(" ");

                    for (String s : arr) {

                        st.add(s);
                        l.add(s);

                    }

                }

            }
            Collections.sort(l);
            System.out.println(" without duplicates " + st);
            System.out.println("with duplicates :" + l);

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}
