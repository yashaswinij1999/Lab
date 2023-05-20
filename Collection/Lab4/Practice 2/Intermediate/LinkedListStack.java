import java.util.LinkedList;
import java.util.List;

public class LinkedListStack {

    int pos = 0;
    int size = 20;

    List<String> l = new LinkedList<>();

    public void push(String element) {

        if (pos > size || pos < 0) {
            return;
        }
        l.add(pos, element);
        pos++;
    }

    public String pop() {

        if (pos < 0 || pos > size) {
            return null;
        }
        pos--;
        String val = l.get(pos);
        return val;

    }

    public String peek(int position) {

        if (pos < 0) {
            return null;
        }
        if (position < 0 || position > size || position > pos) {
            return null;
        }
        String s = l.get(position);
        return s;
    }

}

class Test {

    public static void main(String[] args) {

        LinkedListStack l1 = new LinkedListStack();
        LinkedListStack l2 = new LinkedListStack();
        // l1.push("raju");
        // l1.push("bheema");
        // l1.push("soma");
        // l1.push("arjuna");
        // l1.push("nagarjuna");
        // System.out.println(l1.pop());
        // System.out.println(l1.peek(3));

        String sentence = "Welcome to the World of Java";
        String[] split = sentence.split(" ");

        for (String s : split) {
            l1.push(s);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < split.length; i++) {

            System.out.println(l1.peek(i));
            sb.append(l1.peek(i));
            l2.push(sb.reverse().toString());
            sb.delete(0, sb.length());

        }

        for (int i = 0; i < split.length; i++) {
            System.out.println(l2.peek(i));
        }

    }
}