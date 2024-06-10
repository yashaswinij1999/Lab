
public class MyJob implements Runnable {

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 100; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
                Thread.sleep(500);
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

}

class TestMyJob {

    public static void main(String[] args) {

        MyJob j = new MyJob();

        Thread t1 = new Thread(j);
        Thread t2 = new Thread(j);

        t1.setName("Rama");
        t2.setName("Raju");

        t1.start();
        t2.start();

    }

}
