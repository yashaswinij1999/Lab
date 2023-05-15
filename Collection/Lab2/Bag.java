import java.util.ArrayList;
import java.util.List;

public class Bag {

    private String name;
    private int price;

    List<Item> l = new ArrayList<>();
    int count = 0;

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

            Bag b = (Bag) o1;

            if (this.name.equals(b.name) || this.price == b.price) {
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

    public Bag() {

    }

    public Bag(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void add(Item it) {

        if (count <= l.size()) {
            l.add(count, it);
            count++;

        }
    }

    public boolean searchItem(Item it) {

        for (Item i : l) {
            if (i.equals(it)) {
                return true;
            }
        }
        return false;
    }

    public int getIndividualItemPrice(Item it) {

        int price = 0;

        for (Item i : l) {
            if (i.equals(it)) {
                price = it.getPrice();
            }
        }
        return price;
    }

    public int getTotalPrice() {

        int totalPrice = 0;

        for (Item i : l) {
            totalPrice += i.getPrice();
        }
        return totalPrice;
    }

}

class TestBag {

    public static void main(String[] args) {

        Bag b1 = new Bag("Wildcraft", 500);
        Item i1 = new Cap("Puma", 100);
        Item i2 = new NoteBook("Classmate", 50);
        Item i3 = new Pen("Reynolds", 20);

        b1.add(i1);
        b1.add(i2);
        b1.add(i3);
        System.out.println("count = " + b1.count);

        boolean result = b1.searchItem(i3);
        System.out.println("b1.searchItem(i3) = " + result);

        int price = b1.getIndividualItemPrice(i1);
        System.out.println("b1.getIndividualItemPrice(i1) = " + price);

        int totalPrice = b1.getTotalPrice();
        System.out.println("b1.getTotalPrice() = " + totalPrice);

    }
}