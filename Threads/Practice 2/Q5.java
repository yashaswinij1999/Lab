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

            LetterCounterJob lcj = new LetterCounterJob("C:/Users/yashu/Desktop/Demo/sita.txt");
            Thread t1 = new Thread(lcj);
            t1.start();
            t1.join();
            System.out.println("no of letters in a file = " + lcj.getLetterCount());

            NextPrimeJob npj = new NextPrimeJob(10000000L);
            Thread t2 = new Thread(npj);
            t2.start();
            t2.join();
            System.out.println("the randomly generated primenumber  = " + npj.getPrime());

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }
        System.out.println("main ending ");

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

                    if (c >= 97 && c <= 123 || c >= 65 && c <= 91) {
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

class NextPrimeJob implements Runnable {

    private long primeNumber;
    long getPrimeNumber;

    public NextPrimeJob(long number) {

        this.primeNumber = number;

    }

    public long getPrime() {

        return getPrimeNumber;

    }

    @Override
    public void run() {

        // TODO Auto-generated method stub
        long randomNumber = (long) (Math.random() * 10000000L);

        if (randomNumber < primeNumber) {

            if (randomNumber == 0 || randomNumber == 1) {
                System.out.println("random number is less than zero");
                return;
            }

            if (randomNumber == 2 || randomNumber == 3 || randomNumber == 5 || randomNumber == 7) {
                getPrimeNumber = randomNumber;
                return;
            }

            if ((randomNumber & 1) == 0) {
                System.out.println("the random is even");
                return;
            }

            for (long i = 3; i < (long) (Math.sqrt(randomNumber) + 1); i += 2) {

                if (randomNumber % i == 0) {
                    System.out.println(" is not prime");
                    return;
                }

            }
            getPrimeNumber = randomNumber;
        }

    }
}