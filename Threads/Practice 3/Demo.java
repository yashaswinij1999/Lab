public class Demo extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }
    }

}

class DemoThread implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {

            if (i % 2 != 0) {
                System.out.println(i);

            }

        }

    }

}

class Test {

    public static void main(String[] args) {

        Demo d = new Demo();
        d.start();

        DemoThread dt = new DemoThread();
        Thread t = new Thread(dt);
        t.start();

    }

}