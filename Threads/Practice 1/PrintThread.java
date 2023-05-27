public class PrintThread extends Thread {

    public void run() {

        try {

            String str = null;
            System.out.println(" str.length = " + str.length());

            for (int i = 1; i <= 100; i++) {
                System.out.println("i = " + i + " " + Thread.currentThread().getName());
                Thread.sleep(500);
            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}

class TestThread {

    public static void main(String[] args) {

        System.out.println("Before starting main ");

        PrintThread pt1 = new PrintThread();
        pt1.start();
        pt1.setName("ramu rama ");
        pt1.setPriority(1);

        PrintThread pt2 = new PrintThread();
        pt2.start();
        pt2.setName("hare hare");
        pt2.setPriority(10);

        System.out.println("after starting main ");

    }
}