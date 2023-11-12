import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter the path ");
        String path = sc1.nextLine();

        System.out.println("Enter which name needs to be edited");
        String editName = sc2.next();

        System.out.println("Enter the name which needs to be replaced");
        String newName = sc2.next();

        System.out.println("Enter path where needs to writen");
        String write = sc1.nextLine();

        File f = new File(path);
        BufferedReader br = null;
        List<String> l;
        String line;

        File f2 = new File(write);
        BufferedWriter bw = null;

        if (f.exists() && f.isFile() && f.getName().equals("friends.txt")) {

            try {
                br = new BufferedReader(new FileReader(f));
                l = new ArrayList<>();

                bw = new BufferedWriter(new FileWriter(f2));

                while ((line = br.readLine()) != null) {

                    System.out.println(" names in the friends.txt file");
                    System.out.println(line);

                    if (line.equals(editName)) {
                        line = line.replace(editName, newName);
                        l.add(line);
                    }
                    l.add(line);
                    bw.write(line);
                    bw.newLine();
                    System.out.println(l);

                }
                br.close();

            } catch (IOException e) {

                // TODO: handle exception
                e.printStackTrace();

            } finally {

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
