import java.util.ArrayList;
import java.util.List;

public class Q8 {

    public static void main(String[] args) {

        try {

            List<Integer> l = new ArrayList<>();
            l.add(12);
            l.add(25);
            l.add(3);

            Average a = new Average(l);
            Thread t1 = new Thread(a);
            t1.start();
            t1.join();
            System.out.println(a.getAverageNumber());

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

}

class Average implements Runnable {

    List<Integer> l;
    int averageNumber;
    int sum;

    public int getAverageNumber() {
        return averageNumber;
    }

    public Average(List<Integer> l) {
        this.l = l;
    }

    @Override
    public void run() {

        // TODO Auto-generated method stub
        for (int i : l) {

            sum += i;
            averageNumber = sum / l.size();

        }

    }
}
