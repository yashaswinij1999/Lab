
public class Pen {

    int inkQty;
    String color;

    public void write(String data) {

        if (inkQty > 0) {
            System.out.println("Pen can write a data : " + data + " with " + color + " color ");
        } else {
            System.out.println("The ink qty is less, add ink to it");
        }
        inkQty--;

    }

    public void refill(int inkqty) {

        if (inkqty > 0) {
            inkQty = inkQty + inkqty;
            System.out.println("The total inkQty : " + inkQty);
        } else {
            System.out.println("The ink qty provided is lesser than zero");
        }

    }

}

class TestPen {

    public static void main(String[] args) {

        Pen p = new Pen();
        p.inkQty = 2;
        p.color = "black";
        p.write("rama");
        p.refill(2);
        p.write("rama");
        p.write("sita");
        p.write("hanuman");
        p.write("shiva");
        System.out.println(p.inkQty);

        p = null;

    }

}
