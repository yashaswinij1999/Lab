
public class ParamJob implements Runnable {

    int outPut = 0;

    @Override
    public void run() {

        this.outPut = (int) (Math.random() * 1000000);

    }

    public int getOutPut() {
        return outPut;
    }

}

class TestParamJob {

    public static void main(String[] args) {

        try {
            ParamJob j = new ParamJob();
            Thread t = new Thread(j);
            t.start();
            t.join();
            System.out.println(j.getOutPut());

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

}
