public interface Stack {

    public void push(int element);

    public int pop();

    public void printElements();

}

class ArrayStack implements Stack {

    int[] arr = new int[10];
    int count = 0;

    @Override
    public void push(int element) {

        if (count < arr.length) {
            arr[count] = element;
            count++;
        }
        System.out.println(" element = " + element);

    }

    public int pop() {

        int pop = 0;
        if (count < 0)
            pop= arr[count];
        count--;
        return pop;

    }

    public void printElements() {

        for (int i = 0; i < count; i++) {
            int element = arr[i];
            System.out.println(element);

        }

    }

}

class TestArrayStack {

    public static void main(String[] args) {

        ArrayStack as = new ArrayStack();
        as.push(10);
        as.push(12);
        as.push(15);
        System.out.println(" count after pushing = " + as.count);

        as.pop();
        System.out.println(" count after poping = " + as.count);

        as.printElements();

    }
}