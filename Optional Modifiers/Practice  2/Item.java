
public class Item {

    private double price;
    private String name;
    int serialNo;

    {
        int rand = (int) Math.floor(Math.random() * 1000) + 1;
        this.serialNo = rand;
        System.out.println("serial Number generated");
    }

    public Item(String name) {
        setName(name);
        this.name = name;
        System.out.println("parameterised name constructor");
    }

    public Item(double price, String name) {
        this(name);
        setPrice(price);
        this.price = price;
        System.out.println("parameterised name and price constructor");
    }

    public void setPrice(double price) {
        if (price <= 0.0) {
            throw new IllegalArgumentException("invalid price");
        }
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("invalid Item name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class TestItem {

    public static void main(String[] args) {

        Item i = new Item("Chocolate");
        System.out.println(i.serialNo);
        Item i2 = new Item(10.0,"Pen");
        System.out.println(i2.serialNo);

    }

}
