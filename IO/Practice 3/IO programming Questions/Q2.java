import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the path");

        Scanner sc2 = new Scanner(System.in);

        String path = sc1.nextLine();
        File f = new File(path);

        System.out.println("enter the search word");
        String word = sc2.next();

        LineNumberReader ln = null;
        String line;

        try {

            if (f.isFile() && f.exists() && f.getName().endsWith(".txt")) {

                ln = new LineNumberReader(new BufferedReader(new FileReader(f)));

                while ((line = ln.readLine()) != null) {

                    if (line.contains(word)) {

                        System.out.println(ln.getLineNumber() + " " + line);

                    }

                }

            }

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
