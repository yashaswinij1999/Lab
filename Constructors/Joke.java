public class Joke {

    private String text;
    static int count;

    public Joke() {
        System.out.println("no argument");
        count++;
    }

    public Joke(String text) {
        this.setText(text);
        System.out.println("param constructor");
        count++;
    }

    public void setText(String text) {
        if (text == null || text.equals("")) {
            throw new IllegalArgumentException("Invalid text");
        }
        this.text = text;
    }

    public String gettext() {
        return text;
    }

    public void print() {
        System.out.println("text = " + text);
    }

}

class TestJoke {

    public static void main(String[] args) {

        Joke j1 = new Joke();
        j1.setText("rama");
        j1.print();
        System.out.println("no objects created = " + Joke.count);

        Joke j2 = new Joke();
        j2.setText("ranga");
        j2.print();
        System.out.println("no objects created = " + Joke.count);


    }
}