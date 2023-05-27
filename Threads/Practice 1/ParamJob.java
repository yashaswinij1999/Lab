public class ParamJob implements Runnable {

    int output;

    public int getOutPut() {

        return output;

    }

    public void run() {

        output = (int) (Math.random() * 1000000);

    }
}

class TestParam {

    public static void main(String[] args) {

        try {

            ParamJob pj = new ParamJob();
            Thread t1 = new Thread(pj);
            t1.start();

            // before invoking join() defualt values of instance variable is returned to  main i.e  "zero",
            // after invoking the running thread that is main will wait for other thread to
            // execute that calculates the value ,that value is returned in main.

            t1.join();
            System.out.println("random value = " + pj.getOutPut());

        }

        catch (Exception e) {

            e.printStackTrace();

        }

    }
}
