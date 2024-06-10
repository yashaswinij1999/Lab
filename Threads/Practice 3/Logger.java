
public final class Logger {

    private static int count = 0;
    private static Logger l = null;

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

}

class TestLogger {

    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        System.out.println(l1.equals(l2));

    }

}
