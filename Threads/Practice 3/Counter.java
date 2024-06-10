
public class Counter {

    private int count;

    public int incrementCount() {
        count++;

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return count;
    }

}

class CountJob implements Runnable {

    private Counter c;

    public CountJob(Counter c) {
        this.c = c;
    }

    @Override
    public void run() {
        int count = c.incrementCount();
        System.out.println(count);
    }

}

class TestCountJob {

    public static void main(String[] args) {

        try {

            Counter c = new Counter();
            CountJob j = new CountJob(c);
            Thread t = new Thread(j);
            t.start();
            t.join();

            Thread t1 = new Thread(j);
            t1.start();
            t1.join();

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}
