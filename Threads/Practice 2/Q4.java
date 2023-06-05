public class Q4 {

    public static void main(String[] args) {

        System.out.println("main starting");

        try {

            ParamJob pj = new ParamJob(1000000);
            Thread t1 = new Thread(pj);
            t1.start();
            t1.join();

            System.out.println(" random Value = " + pj.getIntOutPut());

        } 
        catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

        System.out.println("main ending");

    }

}

class ParamJob implements Runnable {

    private int output;

    public ParamJob(int output) {

        this.output = output;

    }

    public int getIntOutPut() {

        return output;

    }

    @Override
    public void run() {

        // TODO Auto-generated method stub
        int randomValue = (int) (Math.random() * 1000000);
        output = randomValue;

    }
}