public class Pen {

    private int inkQty;
    private String color;

    public void setInkQty(int inkQty) {

        if (inkQty < 0 || inkQty > 25) {
            throw new IllegalArgumentException("Invalid Ink Input");

        }
        this.inkQty = inkQty;
    }

    public int getInkQty() {

        return inkQty;
    }

    public void setInkColor(String color) {

        if (color == null || color.equals(" ")) {
            throw new IllegalArgumentException("Invalid ink color Input");
        }
        this.color = color;
    }

    public String getInkColor() {

        return color;
    }

    public void write(String data) {

        if (inkQty > 0) {
            System.out.println("Pen able to write data = " + data);
            inkQty--;
        }
    }

    public void refill(int inkqty) {

        inkQty = inkQty + inkqty;

        System.out.println("inkQty = " + inkQty);
    }
}

class TestPen {

    public static void main(String[] args) {

        Pen p = new Pen();
        p.setInkQty(3);
        System.out.println(" InkQty = " + p.getInkQty());
        p.setInkColor(" Brown ");
        System.out.println(" InkColor = " + p.getInkColor());
        p.write("Rama");
        p.refill(2);
    }
}
