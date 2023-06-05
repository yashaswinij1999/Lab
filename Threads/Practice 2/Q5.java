import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        System.out.println("main starting");

        try {

            LetterCounterJob lcj = new LetterCounterJob("C:/Users/yashu/Desktop/Demo/Rama.txt");
            Thread t1 = new Thread(lcj);
            t1.start();
            t1.join();
            System.out.println("no of letters in a file = " + lcj.getLetterCount());

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }
        System.out.println(" main ending ");

    }

}

class LetterCounterJob implements Runnable {

    private String path;
    int letterCount = 0;

    public LetterCounterJob(String path) {

        this.path = path;

    }

    public int getLetterCount() {

        return letterCount;

    }

    @Override
    public void run() {

        // TODO Auto-generated method stub
        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(path));
            String line;

            while ((line = br.readLine()) != null) {

                for (int i = 0; i < line.length(); i++) {

                    char c = line.charAt(i);

                    if (c >= 97 && c <= 123) {
                        letterCount++;
                    }

                }

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
        }

    }

}