import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter input ");
        String read = sc1.nextLine();
        System.out.println(" input = " + read);

        File f1 = new File(read);
        System.out.println("f1.isFile()= " + f1.isFile());
        System.out.println("f1.isDirectory() = " + f1.isDirectory());
        System.out.println("f1.getName()= " + f1.getName());

        System.out.println("Enter output ");
        String write = sc1.nextLine();
        System.out.println("outPut = " + write);

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {

            if (f1.exists() && f1.isFile()) {

                br = new BufferedReader(new FileReader(f1));
                bw = new BufferedWriter(new FileWriter(write ,true));

                String line;

                try {

                    while ((line = br.readLine()) != null) {

                        System.out.println(line);
                        bw.write(line);

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

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
