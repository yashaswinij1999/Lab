import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter the path");
        String path = sc1.nextLine();

        System.out.println("enter name which needs to be edited");
        String editedName = sc2.next();

        System.out.println("enter which name needs to be added");
        String replacedName = sc2.next();

        editAndDeleteFile(path, editedName, replacedName);

    }

    public static void editAndDeleteFile(String path, String editedName, String replacedName) {

        File f1 = new File(path);
        System.out.println("does f1 file exits : " + f1.exists());
        System.out.println("file name : " + f1.getName());

        BufferedReader br = null;
        BufferedWriter bw = null;
        String line = "";
        List<String> l = new ArrayList<>();

        if (f1.exists() && f1.isFile() && f1.getName().endsWith("txt")) {

            try {

                br = new BufferedReader(new FileReader(f1));

                while ((line = br.readLine()) != null) {

                    if (line.equals(editedName)) {

                        // to replace the name with another name
                        line = line.replace(editedName, replacedName);

                        // to delete a name
                        line = line.replaceAll(editedName, "");

                    }
                    l.add(line);

                }
                System.out.println(l);
                br.close();

                bw = new BufferedWriter(new FileWriter(f1));

                for (String s : l) {
                    bw.write(s);
                    bw.newLine();

                }

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

}
