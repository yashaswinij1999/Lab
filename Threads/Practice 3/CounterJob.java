public class CounterJob implements Runnable {

    Counter c1;

    public CounterJob(Counter c1) {
        this.c1 = c1;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        System.out.println(c1.IncrementCount());

    }

}

class TestCounter {

    public static void main(String[] args) {

        Counter c1 = new Counter();
        CounterJob j = new CounterJob(c1);
        Thread t = new Thread(j);
        t.start();

        Thread t2 = new Thread(j);
        t2.start();

    }

}