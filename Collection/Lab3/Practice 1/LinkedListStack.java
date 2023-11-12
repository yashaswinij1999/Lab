import java.util.LinkedList;
import java.util.List;

public class LinkedListStack {

    LinkedList<String> l = new LinkedList<String>();
    int pos = 0;
    int size = 15;

    public void push(String word) {

        if (pos > size) {
            System.out.println(" Stack is full");
            return;
        }
        if (pos < 0) {
            System.out.println(" position is less than Zero ");
            return;
        }
        l.add(pos, word);
        pos++;
        System.out.println("push = " + l);

    }

    public String pop() {

        if (pos == 0) {
            System.out.println(" there is no element in the stack ");
        }
        pos--;
        String value = l.get(pos);
        return value;
    }

    public String peek(int position) {

        if (position > pos) {
            return null;
        }

        if (position <= 0 || position > size || position > pos) {
            return "invalid";
        }
        return l.get(position - 1);
    }

}

class Test {

    public static void main(String[] args) {

        LinkedListStack lls1 = new LinkedListStack();
        LinkedListStack lls2 = new LinkedListStack();
        // lls.push("amma");
        // lls.push("rama");
        // String value= lls.pop();
        // System.out.println(" pop = "+ value );
        // String peek = lls.peek(1);
        // System.out.println(" peek = " + peek);

        String s = " Welcome to the World of Java";

        String[] st = s.split(" ");

        for (String string : st) {

            lls1.push(string);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < st.length; i++) {

            System.out.println(lls1.peek(i));
            sb.append(lls1.peek(i));
            lls2.push(sb.reverse().toString());
            sb.delete(0, sb.length());

        }
        for (int i= 1; i < st.length; i++) {

            System.out.println(lls2.peek(i));
        }

    }
}
