import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// C:/Users/yashu/Desktop/IO txt files/

public class Q5 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the path");
        String path = sc1.nextLine();

        printTheNamesEndsWithTxt(path);

    }

    public static void printTheNamesEndsWithTxt(String path) {

        File f = new File(path);
        System.out.println("does file exits : " + f.exists());
        System.out.println("is f is a file : " + f.isFile());
        System.out.println("f is directory " + f.isDirectory());

        if (f.exists() && f.isDirectory()) {

            File[] fa = f.listFiles();

            for (File fi : fa) {

                if (fi.exists() && fi.isFile() && fi.getName().endsWith("txt")) {

                    System.out.println(fi.getName());

                }
            }
        }

    }

}
