import java.util.ArrayList;
import java.util.List;

public class ArrayListStack {

    List<String> l = new ArrayList<String>();
    int pos = 0;
    int size = 16;

    public ArrayListStack(int size) {
        this.size = size;
    }

    public ArrayListStack() {

    }

    public void push(String element) {

        if (pos > size) {
            return;
        }
        l.add(element);
        pos++;
        System.out.println("l ===> " + l);
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
        return l.get(position - 1);
    }

}

class TestArrayListStack {

    public static void main(String[] args) {
        ArrayListStack als = new ArrayListStack(16);
        als.push("Rama");
        als.push("Amma");
        als.push("sita");
        als.push("geetha");
        als.push("ranga");
        System.out.println(als.pop());
        System.out.println(als.peek(1));
    }
}
