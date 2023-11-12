import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the path");
        String path = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc2.next();

        noOfOccurances(path, word);

    }

    public static void noOfOccurances(String path, String word) {

        File f = new File(path);
        System.out.println("does file exists : " + f.exists());
        System.out.println("is file : " + f.isFile());
        System.out.println("is directory :" + f.isDirectory());
        int count = 0;

        if (f.exists() && f.isDirectory()) {

            File[] fi = f.listFiles();

            for (File fa : fi) {

                if (fa.exists() && fa.isFile() && fa.getName().endsWith("txt")) {

                    System.out.println("file name :" + fa.getName());

                    BufferedReader br = null;
                    String line = "";

                    try {

                        br = new BufferedReader(new FileReader(fa));
                        count = 0;
                        while ((line = br.readLine()) != null) {

                            String[] split = line.split(" ");

                            for (String s : split) {
                                if (s.equals(word)) {
                                    count++;
                                }
                            }

                        }
                        System.out.println("the word " + word + " occurs " + count + " no of times ");
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
                    }

                }
            }

        }

    }

}
