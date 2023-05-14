public class Man {

    private String name;
    private Woman wife;

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Invlaid name ");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("a man can eat ");
    }

    public void printWifeNames() {
        if (wife != null) {
            System.out.println("the man " + name + " wifes name = " + wife.getName());
        }
    }

    public void marry(Woman w) {
        if (w != null && w.husband == null && wife == null) {
            wife = w;
            wife.husband = this;
            System.out.println("the man marries a woman ");
        } else {
            throw new IllegalArgumentException("cannot marry again");
        }
    }

    public void divorce() {

        wife.husband = null;
        wife = null;

    }
}

class Woman {

    private String name;
    Man husband;

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Invlaid name ");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println("a woman can work");
    }

    public void printHusbandNames() {
        if (husband != null) {
            System.out.println("the woman " + name + " husbands name = " + husband.getName());
        }
    }

}

class TestManAndWoman {

    public static void main(String[] args) {

        Woman w = new Woman();
        Woman w1 = new Woman();
        Man m = new Man();
        m.eat();
        m.setName("Raju");

        w.setName("Rani");
        m.marry(w);
        w.work();
        w.printHusbandNames();
        m.printWifeNames();

        m.divorce();    
        m.marry(w1);

    }
}