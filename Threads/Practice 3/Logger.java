import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Logger {

    private static Logger log = null;
    static int count = 0;
    private static final String path = "C:/Users/yashu/Desktop/Yashu/Lab/Threads/Practice 3/log.txt";

    private Logger() {

    }

    public static Logger getInstance() {

        if (log == null) {

            log = new Logger();
            count++;
            System.out.println(count);

        }
        return log;

    }

    public void log(String data) {

        new Thread(new Runnable() {

            public void run() {

                File f = new File(path);
                String line = "";
                BufferedWriter bw = null;

                try {

                    if (f.getName().endsWith(".txt")) {

                        System.out.println(Thread.currentThread().getName());
                        bw = new BufferedWriter(new FileWriter(f, true));
                        bw.write(data);
                        bw.newLine();

                    }

                } catch (Exception e) {

                    // TODO: handle exception
                    e.printStackTrace();

                } finally {

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

        }).start();

    }

}

class TestLog {

    public static void main(String[] args) {

        System.out.println("main starting");
        Logger log = Logger.getInstance();
        Logger log1 = Logger.getInstance();
        System.err.println(log == log1);
        log1.log("hai");
        log.log("palu");
        System.out.println("main ending");

    }
}