import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Q7 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("enter the path1");
        String path1 = sc1.nextLine();

        System.out.println("enter the path2");
        String path2 = sc2.nextLine();

        BufferedReader br1;
        BufferedReader br2;

        LinkedHashSet<String> l1 = new LinkedHashSet<>();
        LinkedHashSet<String> l2 = new LinkedHashSet<>();
        LinkedHashSet<String> l3 = new LinkedHashSet<>();
        LinkedHashSet<String> l4 = new LinkedHashSet<>();

        String[] arr = new String[l1.size()];

        File f1 = new File(path1);
        File f2 = new File(path2);

        String line1;
        String line2;

        try {

            if (f1.exists() && f1.isFile() && f1.getName().endsWith(".txt") && f2.exists() && f1.isFile()
                    && f1.getName().endsWith(".txt")) {

                br1 = new BufferedReader(new FileReader(f1));
                br2 = new BufferedReader(new FileReader(f2));

                while ((line1 = br1.readLine()) != null) {

                    arr = line1.split(" ");

                    for (String s : arr) {
                        l1.add(s);
                        l3.add(s);
                    }

                }

                while ((line2 = br2.readLine()) != null) {

                    arr = line2.split(" ");

                    for (String s : arr) {
                        l2.add(s);
                        l3.add(s);
                    }

                }

            }

            for (String str : l3) {

                if (!l1.contains(str) || !l2.contains(str)) {
                    l4.add(str);
                }

            }
            System.out.println(l4);

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}