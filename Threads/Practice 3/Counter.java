public class Counter {

    private int count = 0;

    public synchronized int IncrementCount() {

        count++;
        return count;

    }

}
