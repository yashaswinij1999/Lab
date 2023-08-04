public class Pen {

    int inkQty;
    String colour;

    public void setInkQty(int inkQty) {

        if (inkQty < 0 || inkQty > 20) {
            throw new IllegalArgumentException("Invalid ink input");
        } else {
            this.inkQty = inkQty;
        }

    }

    public int getInkQty() {

        return inkQty;

    }

    public void setColour(String colour) {

        if (colour.equals("") || colour == null) {
            throw new IllegalArgumentException("Invalid colour input ");
        } else {
            this.colour = colour;
        }

    }

    public String getColour() {

        return colour;

    }

    public void write(String text) {

        if (text.equals("") || text == null) {

            throw new IllegalArgumentException("Invalid text");

        } else {

            if (getInkQty() > 0) {

                System.out.println("the pen can write the text = " + text);
                inkQty--;

            } else {

                throw new IllegalArgumentException("There is no ink in the pen");

            }

        }

    }

    public void refill(int qty) {

        int totalInkQty = inkQty + qty;
        System.out.println("the total inkQty  = " + totalInkQty);

    }

}

class TestPen {

    public static void main(String[] args) {

        Pen p = new Pen();
        p.setInkQty(1);
        System.out.println("inkQty = " + p.getInkQty());

        p.setColour("red");
        System.out.println("colur name = " + p.getColour());

        p.write("tommy");
        System.out.println("inkQty = " + p.getInkQty());

        p.refill(14);

    }

}