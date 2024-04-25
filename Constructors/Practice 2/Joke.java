
public class Joke {

    private String text;
    static int count = 0;

    public void setText(String text) {
        if (text == null || text.equals("")) {
            throw new IllegalArgumentException("invalid joke text");

        } else {
            this.text = text;
        }

    }

    public String getText() {
        return text;
    }

    public Joke() {
        System.out.println("no arg constructor");
        count++;
    }

    public Joke(String text) {
        setText(text);
        this.text = text;
        System.out.println("parameterised constructor");
        count++;
    }

    public void print() {
        System.out.println("The text : " + text);
    }

}

class TestJoke {

    public static void main(String[] args) {

        Joke j = new Joke("Hy");
        System.out.println(j.getText());
        j.print();
        System.out.println("no of objects created : " + j.count);

    }

}
