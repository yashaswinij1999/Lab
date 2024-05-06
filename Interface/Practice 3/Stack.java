
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

        if (count < arr.length) {
            arr[count] = element;
            count++;
            System.out.println("element added succesfully");
        } else {
            System.out.println("unable to add");
        }
    }

    @Override
    public int pop() {
        // TODO Auto-generated method stub

        int lastElement = 0;
        int temp = 0;

        if (count > 0) {
            temp = arr[count - 1];
            lastElement = temp;
            temp = 0;
            count--;
            System.out.println("element removed succesfully");
        }
        return lastElement;
    }

    @Override
    public int peek() {

        int temp = 0;

        if (count > 0) {
            temp = arr[count - 1];
        }
        return temp;
    }

    @Override
    public void printElements() {
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

}

class TestStack {

    public static void main(String[] args) {

        ArrayStack myStack = new ArrayStack();
        myStack.push(5);
        myStack.push(10);
        myStack.push(15);
        myStack.printElements();
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.count);
        System.out.println("peek " + myStack.peek());
        myStack.printElements();
        myStack.push(20);
        myStack.printElements();
    }

}
