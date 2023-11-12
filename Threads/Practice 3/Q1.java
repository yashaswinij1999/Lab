public class Q1 extends Thread {

    public void run() {

        try {

            String s = null;
            System.out.println(s.length());

            for (int i = 0; i < 10; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                    Thread.sleep(500);

                }

            }

        } catch (NullPointerException et) {

            et.printStackTrace();

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}

class TestQ1 {

    public static void main(String[] args) {

        try {

            System.out.println("main starting");
            Q1 q = new Q1();
            q.setName("ramu");
            // q.setPriority(10);
            q.start();
            System.out.println("main ending");

            Q1 q1 = new Q1();
            q1.setName("raja");
            // q1.setPriority(1);
            q1.start();

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}