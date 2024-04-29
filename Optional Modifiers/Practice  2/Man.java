
public class Man {

    private String name;
    private Woman wife;

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("invalid String name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("A man can eat food");
    }

    public void marry(Woman w1) {
        if (w1 != null && w1.husband == null && wife == null) {
            wife = w1;
            wife.husband = this;
            System.out.println(name + " & " + w1.getName() + " are married to each other ");
        } else {
            System.out.println("Second Marriage is not allowed");
        }
    }

    public void printWifesName() {
        if (wife != null) {
            System.out.println(name + " has a wife called " + wife.getName());
        } else {
            System.out.println(name + " has not married yet");
        }
    }

    public void divorce() {
        wife.husband = null;
        wife = null;
        System.out.println("Both husband and wife are divorced");

    }

}

class Woman {

    String name;
    Man husband;

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("invalid String name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println("A woman can work");
    }

    public void printHubbysName() {
        if (husband != null) {
            System.out.println(name + " has a husband called " + husband.getName());
        } else {
            System.out.println(name + " has not married yet");
        }
    }

}

class TestMan {

    public static void main(String[] args) {

        Man m = new Man();
        m.setName("Arbaz");

        Woman w = new Woman();
        w.setName("Malaika");

        m.marry(w);
        // m.printWifesName();
        // w.printHubbysName();

        Woman w2 = new Woman();
        w2.setName("Rosie");
        // w2.printHubbysName();

        m.divorce();
        m.marry(w2);
    }

}
