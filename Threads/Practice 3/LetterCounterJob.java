
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LetterCounterJob implements Runnable {

    String path;
    int count = 0;

    public LetterCounterJob(String path) {
        this.path = path;
    }

    @Override
    public void run() {

        File f = new File(path);
        BufferedReader br = null;
        String line = "";

        if (f.isFile() && f.exists() && f.getName().endsWith(".txt")) {

            try {

                br = new BufferedReader(new FileReader(f));
                while ((line = br.readLine()) != null) {

                    for (int i = 0; i < line.length(); i++) {

                        if (Character.isLetter(line.charAt(i))) {
                            count++;
                        }

                    }

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

    long input;
    long outPut;

    public NextPrimeJob(long input) {
        this.input = input;
    }

    @Override
    public void run() {

        long rand = (long) (Math.random() * 10000000);
        System.out.println("random number " + rand);

        if (rand > input) {

            if (rand <= 1) {
                System.out.println("rand is lesse than one  hence its not prime");
                return;
            }

            if (rand == 2 || rand == 3 || rand == 5 || rand == 7) {
                this.outPut = rand;
            }

            if (rand % 2 == 0) {
                System.out.println("rand is divisible by two, hence its not prime");
                return;
            }

            for (int i = 3; i <= (int) (Math.sqrt(rand)); i += 2) {

                if (rand % i == 0) {
                    System.out.println("its not prime");
                    return;
                }

            }
            this.outPut = rand;

        } else {
            System.out.println("random number is less than input ");
        }
    }

    public long getPrime() {
        return this.outPut;
    }

}

class TestLetterCounterJob {

    public static void main(String[] args) {

        try {

            // LetterCounterJob l = new LetterCounterJob("C:/Users/yashu/Desktop/Java/Java Labs/IO/Practice 3/IO Programming Questions/friends.txt");
            // Thread t = new Thread(l);
            // t.start();
            // t.join();
            // System.out.println(l.getCount());
            // long l1 = System.currentTimeMillis();
            // System.out.println("time took to run this program " + l1);
            // NextPrimeJob j = new NextPrimeJob(2);
            // Thread t2 = new Thread(j);
            // t2.start();
            // t2.join();
            // System.out.println(j.getPrime());
            // long l2 = System.currentTimeMillis();
            // System.out.println("time took to run this program " + l2);
        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}
