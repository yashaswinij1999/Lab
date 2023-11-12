import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("enter the path");
        String path1 = sc1.nextLine();

        System.out.println("enter the name which you want edit");
        String editName = sc1.next();

        // System.out.println("enter the name which you want to replace");
        // String replace = sc1.next();

        // System.out.println("enter the name which you want to delete");
        // String deleteName = sc1.next();

        List<String> l = new ArrayList<>();

        File f1 = new File(path1);
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;

        try {

            if (f1.exists() && f1.isFile() && f1.getName().endsWith(".txt")) {

                br = new BufferedReader(new FileReader(f1));

                while ((line = br.readLine()) != null) {

                    System.out.println(line);

                    if (line.contains(editName)) {

                        line = line.replace(editName, "");
                        l.add(line);

                    } else {

                        l.add(line);

                    }

                    bw = new BufferedWriter(new FileWriter(f1));

                }

            }

            for (String s : l) {

                bw.write(s);
                bw.newLine();

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
