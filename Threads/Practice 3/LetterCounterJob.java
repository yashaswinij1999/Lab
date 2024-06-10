
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

class TestLetterCounterJob {

    public static void main(String[] args) {

        try {

            LetterCounterJob l = new LetterCounterJob("C:/Users/yashu/Desktop/Java/Java Labs/IO/Practice 3/IO Programming Questions/friends.txt");

            Thread t = new Thread(l);
            t.start();
            t.join();
            System.out.println(l.getCount());

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

}
