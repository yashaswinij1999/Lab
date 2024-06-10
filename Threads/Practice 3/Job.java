
public class Job implements Runnable {

    int val;

    public Job(int val) {
        this.val = val;
    }

    @Override
    public void run() {

        for (int i = val; i < val + 100; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }

    }

}

class TestJob {

    public static void main(String[] args) {

        Job j1 = new Job(10);
        Thread t1 = new Thread(j1);
        t1.setName("Rama");
        t1.start();

        Job j2 = new Job(1000);
        Thread t2 = new Thread(j2);
        t2.setName("Raju");
        t2.start();

    }

}
