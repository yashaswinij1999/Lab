public class MyJob implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub

        for (int i = val; i < val + 100; i++) {

            System.out.println(i + " " + Thread.currentThread().getName());

        }

    }

    int val;

    public MyJob(int val) {
        this.val = val;
    }

}

class TestMyJob {

    public static void main(String[] args) {

        MyJob m = new MyJob(10);
        Thread t = new Thread(m);
        t.setName("deeksha");
        t.start();

        MyJob m1 = new MyJob(1000);
        Thread t2 = new Thread(m1);
        t2.setName("sheeba");
        t2.start();

    }

}
