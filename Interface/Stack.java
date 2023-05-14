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

    public int pop() {

        int temp = 0;
        if (count > 0) {
            temp = arr[count - 1];
            arr[count - 1] = 0;
            count--;
        }
        return temp;
    }

    public int peek() {

        int temp = 0;
        if (count > 0) {
            temp = arr[count - 1];

        }
        return temp;
    }

    public void printElements() {

        for (int i = 0; i < count; i++) {
            int element = arr[i];
            System.out.println("element = " + element);
        }
    }

}

class TestStack {

    public static void main(String[] args) {

        ArrayStack as = new ArrayStack();
        as.push(15);
        as.push(1);
        as.push(18);
        as.push(21);
        System.out.println("poped element = " + as.pop());
        System.out.println("poped element = " + as.pop());
        System.out.println(" peek  = " + as.peek());
        as.printElements();
        
       
    }
}