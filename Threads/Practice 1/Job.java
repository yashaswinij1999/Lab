public class Job implements Runnable {

    private int val;

    public Job(int num) {

        this.val = num;

    }

    public void run() {

        for (int i = val; i <= val + 100; i++) {

            System.out.println(Thread.currentThread().getName() + " " + i);

        }
    }

}

class TestJob {

    public static void main(String[] args) {

        System.out.println(" main starting ");
        Job jo1 = new Job(10);
        Thread t1 = new Thread(jo1);
        t1.setName("chinti");
        t1.start();
        
        Job jo2 = new Job(1000);
        Thread t2 = new Thread(jo2);
        t2.setName("minti");
        t2.start();

        System.out.println(" main ending ");

    }
}