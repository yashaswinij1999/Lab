public class Q1 {

    public static void main(String[] args) {

        System.out.println("main starting");

        RamaJob r1 = new RamaJob();
        r1.start();
        r1.setName("rama 1");
        r1.setPriority(8);

        try {

            r1.join();

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

        RamaJob r2 = new RamaJob();
        r2.start();
        r2.setName("rama 2");
        r2.setPriority(9);

        try {

            r2.join();

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

        System.out.println("main ending");

    }
}

class RamaJob extends Thread {

    public void run() {

        String str = null;
        System.out.println(str.length());

        for (int i = 1; i < 100; i++) {

            System.out.println(" i = " + i + " name = " + currentThread().getName());

        }
        try {
           
            Thread.sleep(500);

        } 
        catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }
        

    }
}