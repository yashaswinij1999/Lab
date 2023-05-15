public class Item {

    private String name;
    private int price;

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Invalid price");
        }
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public boolean equals(Object o1) {

        if (o1 instanceof Item) {

            Item it = (Item) o1;

            if (this.name.equals(it.name) || this.price == it.price) {
                return true;
            }

        }
        return false;
    }

    public int hashCode() {
        return (name + price).hashCode();
    }

    public String toString() {
        return "Item : " + name + "," + "Price : " + price;
    }

    public Item() {

    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class Cap extends Item {

    public Cap() {

    }

    public Cap(String name, int price) {
        super(name, price);
    }

}

class Pen extends Item {

    public Pen() {

    }

    public Pen(String name, int price) {
        super(name, price);
    }

}

class NoteBook extends Item {

    public NoteBook() {

    }

    public NoteBook(String name, int price) {
        super(name, price);
    }

}