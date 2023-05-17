import javax.swing.text.html.parser.Element;

public interface Stack {
    public void push(int element);

    public int pop();

    public int peek();

    public void printElements();
}

class ArrayStack implements Stack {

    int[] arr = new int[10];
    int count = 0;

    public void push(int element) {
        if (count < arr.length) {
            arr[count] = element;
            count++;
        }
    }

    public int pop() {
        int temp = 0;

        if (count > 0) {
            temp = arr[count - 1];
            count--;
            arr[count] = 0;
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
           System.out.println(element);

        }
    }

}
class TestStack{

    public static void main(String[] args) {
        
        ArrayStack as = new ArrayStack();
        as.push(5); 
        as.push(10); 
        as.push(15); 
        as.printElements();
        System.out.println("peek = " + as.peek());
        System.out.println("pop = " + as.pop());
        System.out.println("peek = " + as.peek());
        as.printElements();
        as.push(20);
    }
}