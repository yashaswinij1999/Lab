public class Counter {

    private int count;

    public synchronized int incrementCount() {
        count++;
        return count;
    }

}

class CountJob implements Runnable {

    Counter count;

    public CountJob(Counter count) {

        this.count = count;

    }

    @Override
    public void run() {

        // TODO Auto-generated method stub
        for (int i = 1; i < 10; i++) {
            System.out.println("thread name ----> " + Thread.currentThread().getName() + " " + count.incrementCount());
        }

    }
}

class TestCounter {

    public static void main(String[] args) {

        try {

            Counter c = new Counter();
            CountJob cj = new CountJob(c);
            Thread t1 = new Thread(cj);
            t1.start();

            Thread t2 = new Thread(cj);
            t2.start();

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }
}