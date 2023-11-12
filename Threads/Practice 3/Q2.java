public class Q2 implements Runnable {

    @Override
    public void run() {

        try {

            // TODO Auto-generated method stub
            for (int i = 0; i < 10; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                    Thread.sleep(500);
                }

            }

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}

class TestQ2 {

    public static void main(String[] args) {

        Q2 s = new Q2();
        Thread t = new Thread(s);
        t.setName("yashu");
        t.start();

        Q2 s2 = new Q2();
        Thread t1 = new Thread(s2);
        t1.setName("ammu");
        t1.start();

    }

}
