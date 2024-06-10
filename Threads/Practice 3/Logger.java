
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public final class Logger {

    private static int count = 0;
    private static Logger l = null;
    private static String path = "C:/Users/yashu/Desktop/Java/Java Labs/Threads/Practice 3/Log.txt";

    private Logger() {

    }

    public static Logger getInstance() {

        if (l == null) {
            l = new Logger();
            count++;
            System.out.println("the number Logger object created = " + count);
        }
        return l;

    }

    public void log(String data) {

        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub

                File f = new File(path);
                BufferedWriter bw = null;

                System.out.println(f.getName());

                try {

                    bw = new BufferedWriter(new FileWriter(f, true));
                    bw.write(data);
                    bw.newLine();

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

class TestLogger {

    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        l1.log("rama");
        l2.log("sita");

    }

}
