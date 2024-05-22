
import java.util.ArrayList;

public class LinkedListArray {

    int pos = 0;
    int size = 20;
    ArrayList<String> l = new ArrayList<>();

    public void push(String s) {

        if (pos > size) {
            System.out.println("Stack is full");
            return;
        }
        if (pos < 0) {
            System.out.println("the position is less than zero");
        }
        l.add(pos, s);
        pos++;
        System.out.println(l);
    }

    public void pop() {

        if (pos > size) {
            System.out.println("the position is greater than size");
        }
        if (pos == 0) {
            System.out.println("there are no elements left ");
        }

        int temp = pos - 1;
        l.remove(temp);
        pos--;
        System.out.println(l);

    }

    public String peek(int position) {

        if (pos == 0) {
            return "there is elements present in the array";
        }
        if (position > pos || position > size) {
            return "position in invalid";
        }

        return l.get(position);

    }

    public void printElements() {

        for (String s : l) {
            System.out.println(s);
        }
    }

}

class TestLinkedList {

    public static void main(String[] args) {

        String sentence = "Welcome to Java";
        String str = "";

        LinkedListArray l = new LinkedListArray();
        LinkedListArray l2 = new LinkedListArray();
        // l.push("rama");
        // l.push("sita");
        // l.push("krishna");
        // l.push("laxmana");
        // System.out.println(l.peek(2));

        StringBuilder sb = new StringBuilder();
        String[] arr = sentence.split(" ");
        for (String s : arr) {
            l.push(s);
        }
        System.out.println(l.pos);
        for (int i = 0; i < l.pos; i++) {
            sb.append(l.peek(i));
            l2.push(sb.reverse().toString());
            sb.delete(0, sb.length());

        }

        for (int i = 0; i < l2.pos; i++) {

            str = l2.

        }
        System.out.println(str);
    }

}
