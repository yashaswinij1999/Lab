import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private String path = "C:/Users/yashu/Desktop/IO txt files/log.txt";
    private static Logger obj = null;
    static int count = 1;

    public void log(String data) {

        File f = new File(path);
        System.out.println("does file exists " + f.exists());
        System.out.println("file is a file " + f.isFile());
        System.out.println("is file a directory " + f.isDirectory());

        if (f.isFile() && f.exists() && f.getName().endsWith("txt")) {

            BufferedWriter bw = null;

            try {

                bw = new BufferedWriter(new FileWriter(path, true));
                bw.write(data);
                bw.newLine();
                System.out.println("data : " + data);

            } catch (IOException e) {

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
    }

    private Logger() {
        System.out.println("no arg constructor");
    }

    public static Logger getInstance() {

        if (obj == null) {
            obj = new Logger();
            System.out.println("the number of objects created = " + count);
            count++;
        }
        return obj;
    }

}

class TestLogger {

    public static void main(String[] args) {

        try {
            System.out.println("main starting");
            Logger log = Logger.getInstance();
            Logger log1 = Logger.getInstance();
            Logger log2 = Logger.getInstance();
            new Thread() {
                public void run() {
                    log2.log("rama");
                };
            }.start();
            System.out.println(log1 == log2);

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}