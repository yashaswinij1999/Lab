import java.util.LinkedList;
import java.util.List;

public class LinkedListStack {

    List<String> l = new LinkedList<String>();
    int pos = 0;
    int size = 100;

    public LinkedListStack(int size) {
        this.size = size;
    }

    public LinkedListStack() {

    }

    public void push(String element) {

        if (pos > size) {
            return;
        }
        l.add(element);
        pos++;
        // System.out.println("l ===> " + l);
    }

    public String pop() {

        if (pos < 0 || pos > size) {
            return null;
        }
        pos--;
        return l.get(pos);

    }

    public String peek(int position) {

        if (pos < 0) {
            return null;
        }
        if (pos > size || position > pos || position < 0) {
            return null;
        }
        return l.get(position-1);
    }
}

class TestLinkedListStack {

    public static void main(String[] args) {

        LinkedListStack l1 = new LinkedListStack();
        LinkedListStack l2 = new LinkedListStack();

        String sentence = "Welcome to the World of Java";
        String[] split = sentence.split(" ");

        for (String s : split) {
            l1.push(s);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < split.length; i++) {

            l1.peek(i);
            sb.append(l1.peek(i));
            l2.push(sb.reverse().toString());
            sb.delete(0, sb.length());
        }

        for (int i = 1; i < split.length; i++) {

            System.out.println(l2.peek(i));
        }
    }
}
