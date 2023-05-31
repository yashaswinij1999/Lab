import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Q7 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter the path1");
        String path1 = sc1.nextLine();

        System.out.println("Enter path2");
        String path2 = sc1.nextLine();

        File f1 = new File(path1);
        File f2 = new File(path2);

        System.out.println(f1.exists());
        System.out.println(f2.exists());

        if (f1.exists() && f1.isFile() && f2.exists() && f2.isFile()) {

            BufferedReader br1 = null;
            BufferedReader br2 = null;

            LinkedHashSet<String> s1;
            LinkedHashSet<String> s2;
            LinkedHashSet<String> s3;

            try {

                br1 = new BufferedReader(new FileReader(f1));
                br2 = new BufferedReader(new FileReader(f2));

                String line1;
                String line2;

                String[] split1;
                String[] split2;

                s1 = new LinkedHashSet<>();
                s2 = new LinkedHashSet<>();
                s3 = new LinkedHashSet<>();

                while ((line1 = br1.readLine()) != null) {

                    split1 = line1.split(" ");

                    for (String str1 : split1) {
                        s1.add(str1);
                    }

                }
                System.out.println("s1 = " + s1);

                while ((line2 = br2.readLine()) != null) {

                    split2 = line2.split(" ");

                    for (String str2 : split2) {
                        s2.add(str2);
                    }

                }
                System.out.println("s2 = " + s2);

                for (String st1 : s1) {

                    int count = 1;

                    for (String st2 : s2) {

                        if (st1.equals(st2)) {

                            count++;

                        }

                    }
                    if (count == 1) {

                        s3.add(st1);

                    }

                }
                System.out.println("s3 = " + s3);

            } catch (Exception e) {

                // TODO: handle exception
                e.printStackTrace();

            }
        }

    }

}
