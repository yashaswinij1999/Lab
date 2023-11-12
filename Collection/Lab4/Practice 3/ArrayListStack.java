import java.util.ArrayList;
import java.util.List;

public class ArrayListStack implements Stack {

    static int count = 0;

    List<String> l = new ArrayList<>();

    public ArrayListStack() {

    }

    public void push(String element) {

        if (count <= l.size()) {
            l.add(element);
            count++;
        }
    }

    public void pop() {

        String str = "";

        if (count > 0) {

            l.remove(count - 1);
            count--;

        }

    }

    public String peek(int pos) {

        String s = "";

        if (pos < 0 || pos > count) {
            return "invalid";
        }

        if (pos < count) {
            s = l.get(pos);
        }
        return s;

    }

    public void printElements() {

        for (int i = 0; i < count; i++) {

            String s = l.get(i);
            System.out.println(s);

        }

    }

}

class TestArrayListStack {

    public static void main(String[] args) {

        ArrayListStack al = new ArrayListStack();
        al.push("yashu");
        al.push("shreeja");
        al.push("amma");
        System.out.println("count after adding element = " + ArrayListStack.count);

        // System.out.println(al.peek(0));

        al.printElements();

        // al.pop();
        // System.out.println("count after removing element = " + ArrayListStack.count);

    }

}
