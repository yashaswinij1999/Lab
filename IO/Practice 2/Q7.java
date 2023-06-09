import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Q7 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the File name 1");
        String file1 = sc1.nextLine();

        System.out.println("Enter the File name 2");
        String file2 = sc1.nextLine();
        identifyWordsNotPresentonBothTheFiles(file1, file2);

    }

    public static void identifyWordsNotPresentonBothTheFiles(String file1, String file2) {

        File f1 = new File(file1);
        File f2 = new File(file2);

        BufferedReader br1 = null;
        BufferedReader br2 = null;

        String line1;
        String line2;
        LinkedHashSet<String> l = new LinkedHashSet<>();
        String[] st1 = new String[0];
        String[] st2 = new String[0];

        if (f1.exists() && f2.isFile() && f2.exists() && f2.isFile()) {

            try {

                br1 = new BufferedReader(new FileReader(f1));
                br2 = new BufferedReader(new FileReader(f2));
                LinkedHashSet<String> set1 = new LinkedHashSet<>();
                LinkedHashSet<String> set2 = new LinkedHashSet<>();

                while ((line1 = br1.readLine()) != null) {

                    st1 = line1.split(" ");
                    for (String str1 : st1) {
                        set1.add(str1);
                        l.add(str1);
                    }

                }

                while ((line2 = br2.readLine()) != null) {

                    st2 = line2.split(" ");
                    for (String str2 : st2) {
                        set2.add(str2);
                        l.add(str2);
                    }

                }

                for (String str : l) {

                    if (!set1.contains(str) || !set2.contains(str)) {
                        System.out.println(str);
                    }

                }

            } catch (IOException e) {

                // TODO: handle exception
                e.printStackTrace();

            }

        }

    }
}
