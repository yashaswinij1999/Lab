import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.io.Writer;
import java.nio.Buffer;

public class LetterCounterJob implements Runnable {

    String path = null;
    int count = 0;
    BufferedReader br = null;

    public LetterCounterJob(String path) {

        this.path = path;

    }

    public void run() {

        try {

            File f = new File(path);

            br = new BufferedReader(new FileReader(f));
            String line = "";

            while ((line = br.readLine()) != null) {

                for (int i = 0; i < line.length(); i++) {

                    char c = line.charAt(i);

                    if (Character.isLetter(c)) {

                        count++;

                    }

                }

            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        } finally {

            try {

                if (br == null) {
                    br.close();
                }

            } catch (Exception e) {

                // TODO: handle exception
                e.printStackTrace();

            }

        }

    }

    public int getCount() {

        return count;

    }

}

class NextPrimeJob implements Runnable {

    private long primeNumber;
    long random;

    public NextPrimeJob(long primeNumber) {

        this.primeNumber = primeNumber;

    }

    public long getPrimeNumber() {
        return primeNumber;
    }

    public void run() {

        random = (long) (Math.random() * 10000000L);
        if (random > primeNumber) {

            if (random <= 1) {
                System.out.println("the no is lesser than one");
                return;
            }

            if (random == 2 || random == 3 || random == 5 || random == 7) {
                System.out.println("is prime");
                primeNumber = random;
                return;
            }

            if (random % 2 == 0) {
                System.out.println("the number is divisible by 2");
                return;
            }

            for (int i = 3; i < (long) (Math.sqrt(random) + 1); i += 2) {

                if (random % i != 0) {
                    System.out.println("is   prime number");
                    primeNumber = random;
                    return;

                }

            }

        }

    }

}

class TestLetterJob {

    public static void main(String[] args) {

        try {

            System.out.println("Main starting");
            LetterCounterJob l = new LetterCounterJob("C:/Users/yashu/Desktop/Yashu/Lab/Threads/Practice 3/log.txt");
            Thread t = new Thread(l);
            t.start();
            t.join();

            NextPrimeJob n = new NextPrimeJob(159);
            Thread t1 = new Thread(n);
            t1.start();
            t1.join();
            System.out.println("the prime number = " + n.getPrimeNumber());
            System.out.println("the number of letters in file = " + l.getCount());

            long l1 = System.currentTimeMillis();

            // implement the job code
            long l2 = System.currentTimeMillis();

            System.out.println(l2 - l1);

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }
}