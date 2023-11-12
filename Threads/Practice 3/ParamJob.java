public class ParamJob implements Runnable {

    int outPut;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        outPut = (int) (Math.random() * 1000000);

    }

    public int getOutPut() {
        return outPut;
    }

}

class TestParam {

    public static void main(String[] args) {

        try {

            ParamJob p = new ParamJob();
            Thread t = new Thread(p);
            t.start();
            t.join();

            System.out.println(p.getOutPut());

        } catch (Exception e) {

            // TODO: handle exception
            e.printStackTrace();

        }

    }

}