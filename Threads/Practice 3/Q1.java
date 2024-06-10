
public class Q1 extends Thread {

    public void run() {

        String str = null;

        try {

            for (int i = 1; i <= 100; i++) {

                System.out.println(i + " " + Thread.currentThread().getName());
                System.out.println(str.length());
                Thread.sleep(500);

            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

}

class Test {

    public static void main(String[] args) {

        // System.out.println("before printing main");
        // Q1 q1 = new Q1();
        // q1.setName("Rama");
        // q1.setPriority(10);
        // q1.start();
        // Q1 q2 = new Q1();
        // q2.setName("Raju");
        // q2.setPriority(1);
        // q2.start();
        // System.out.println("after printing main");
    }

}
