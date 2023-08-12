public interface Stack {

    public void push(int element);

    public int pop();

    public int peek();

    public void printElements();

}

class ArrayStack implements Stack {

    int[] arr = new int[10];
    int count = 0;

    @Override
    public void push(int element) {

        // TODO Auto-generated method stub
        if (count < arr.length) {
            arr[count] = element;
            count++;
        }

    }

    @Override
    public int peek() {

        int peek = 0;

        // TODO Auto-generated method stub
        peek = arr[count - 1];
        return peek;

    }

    @Override
    public int pop() {

        int pop = 0;
        // TODO Auto-generated method stub
        pop = arr[count - 1];
        arr[count - 1] = 0;
        count--;
        return pop;

    }

    @Override
    public void printElements() {

        String s = "";

        // TODO Auto-generated method stub
        for (int i = 0; i < count; i++) {

            int x = arr[i];

            System.out.print(" " + x);

        }

    }

}

class TestStack {

    public static void main(String[] args) {

        ArrayStack ar = new ArrayStack();
        ar.push(12);
        ar.push(20);
        ar.push(58);
        ar.push(6);
        System.out.println("the number of elements : " + ar.count);

        int peek1 = ar.peek();
        System.out.println("peek : " + peek1);

        int pop1 = ar.pop();
        System.out.println("the number of elements : " + ar.count);

        ar.printElements();

        int peek2 = ar.peek();
        System.out.println("peek : " + peek2);

        int pop2 = ar.pop();
        System.out.println("the number of elements : " + ar.count);

        int peek3 = ar.peek();
        System.out.println("peek : " + peek3);

        ar.printElements();

    }

}