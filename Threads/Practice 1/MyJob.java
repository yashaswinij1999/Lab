public class MyJob implements Runnable {

    public void run() {

        try {

            for (int i = 0; i <= 100; i++) {

                System.out.println(" name = " + Thread.currentThread().getName());
                Thread.sleep(500);

                // due to sleep static method we are influemcing the thread to have ordered output
                // that leads to difference between first and second approach
            }
        } 
        catch (Exception e) {

            e.printStackTrace();

        }

    }

}
class TestMyJob{

    public static void main(String[] args) {
        
        System.out.println(" main starting ");

        MyJob m = new MyJob();
        Thread t1 = new Thread(m);
        t1.setName(" 1st ");
        t1.start();

        Thread t2 = new Thread(m);
        t2.setName(" 2nd ");
        t2.start();

        System.out.println(" main ending ");

    }
}