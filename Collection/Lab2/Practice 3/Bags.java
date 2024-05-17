
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bags {

    List<Item> items;

    public Bags(List<Item> l) {
        this.items = new ArrayList<>();
    }

    public boolean equals(Object e) {

        if (e instanceof Bags) {

            Bags b = (Bags) e;

            if (this.items == b.items) {
                return true;
            }

        }
        return false;

    }

    public int hashCode() {
        return (items.toString()).hashCode();
    }

    public void add(Item i) {

        items.add(i);
        System.out.println("items added succesfully");

    }

    public boolean searchItem(Item i) {

        Iterator it = items.iterator();

        while (it.hasNext()) {
            Object elem = it.next();

            if (elem instanceof Item) {

                Item item = (Item) elem;
                if (item == i) {
                    return true;
                }

            }

        }
        return false;

    }

    public int getItemPrice(Item i) {

        Iterator it = items.iterator();

        while (it.hasNext()) {
            Object elem = it.next();

            if (elem instanceof Item) {

                Item item = (Item) elem;

                if (i == item) {
                    return item.price;
                }

            }

        }
        throw new IllegalArgumentException("invalid Object");

    }

    public int getTotalItemPrice() {

        Iterator it = items.iterator();
        int sum = 0;

        while (it.hasNext()) {
            Object elem = it.next();

            if (elem instanceof Item) {

                Item item = (Item) elem;
                sum += item.price;

            }

        }
        return sum;

    }

}

class TestBags {

    public static void main(String[] args) {

        // List<Item> l = new ArrayList<>();

        // Bags b = new Bags(l);

        // Item i1 = new Item("Caps", 10);
        // Item i2 = new Item("Lipstick", 100);
        // Item i3 = new Item("Pen", 5);
        // Item i4 = new Item("Chocolate", 150);
        // Item i5 = new Item("spoon", 50);

        // b.add(i1);
        // b.add(i2);
        // b.add(i3);
        // b.add(i4);
        // System.out.println("Searching for a Item : " + b.searchItem(i5));
        // System.out.println("get item price : " + b.getItemPrice(i4));
        // System.out.println("get Total price : " + b.getTotalItemPrice());

    }

}
