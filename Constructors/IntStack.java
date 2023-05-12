public class IntStack {

    int[] stack;
    static int count;

    public IntStack() {
        stack = new int[10];
    }

    public void push(int n) {
        if (count < stack.length) {
            stack[count] = n;
            count++;
        }
    }

    public int pop() {
        int temp = 0;
        if (count > 0) {
            temp = stack[count - 1];
            stack[count] = 0;
            count--;
        }
        return temp;
    }

}

class Test {

    public static void main(String[] args) {

        IntStack is = new IntStack();
        is.push(2);
        is.push(5);
        is.push(6);
        is.push(8);
        is.push(10);
        System.out.println(" count = " + IntStack.count);
        System.out.println("pop element = " + is.pop());
        System.out.println("pop element = " + is.pop());
        System.out.println(" count = " + IntStack.count);

    }
}
