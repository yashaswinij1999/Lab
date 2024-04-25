
public class Bags {

    Item i;
    Item[] items;
    int count = 0;

    public Bags(int num) {
        items = new Item[num];
        System.out.println("parameterised constructor");
    }

    public void addItem(Item item) {

        if (items.length > 0) {
            items[count] = item;
            count++;
        }
        System.out.println("Items added succesfully");

    }

    public boolean Search(String name) {

        boolean isFound = false;

        for (Item i : items) {

            if (i.getName().equals(name)) {
                return isFound = true;
            } else {
                System.out.println("Our bag doesnot contain given item");

            }

        }
        return isFound;

    }

    public int getItemPrice(String name) {

        int itemPrice = 0;

        for (Item i : items) {
            if (i.getName().equals(name)) {
                itemPrice = i.getPrice();

            } else {
                break;
            }
        }
        return itemPrice;

    }

    public int getTotalPrice() {

        int totalPrice = 0;

        for (Item i : items) {

            totalPrice += i.getPrice();

        }
        return totalPrice;

    }

}

class TestBag {

    public static void main(String[] args) {

        Bags g = new Bags(3);
        Item i1 = new Item("Cap", 10);
        Item i2 = new Item("lipstick", 100);
        Item i3 = new Item("pen", 20);
        g.addItem(i1);
        g.addItem(i2);
        g.addItem(i3);
        int price = g.getItemPrice("Cap");
        System.out.println(price);
        int totalPrice = g.getTotalPrice();
        System.out.println(totalPrice);

    }

}
