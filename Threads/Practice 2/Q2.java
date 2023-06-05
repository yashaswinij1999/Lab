public class Q2 {

    public static void main(String[] args) {

        MyJob j1 = new MyJob();

        Thread t1 = new Thread(j1);
        t1.start();
        t1.setName("ram");

        Thread t2 = new Thread(j1);
        t2.start();
        t2.setName("sham");

    }

}

class MyJob implements Runnable {

    @Override
    public void run() {

        // TODO Auto-generated method stub
        for (int i = 1; i < 100; i++) {

            System.out.println(" i = " + i + " name = " + Thread.currentThread().getName());
            
            try {

                Thread.sleep(500);

            } catch (Exception e) {

                // TODO: handle exception
                e.printStackTrace();

            }

        }

    }
}