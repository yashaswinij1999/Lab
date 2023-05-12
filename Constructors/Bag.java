public class Bag {

    String name;
    double price;
    Item[] item;
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

    public Bag(String name, int size) {
        this.setName(name);
        item = new Item[size];
    }

    public void addItem(Item it) {
        if (count < item.length) {
            item[count] = it;
            count++;
        }
    }

    public boolean searchItem(Item it) {

        for (Item items : item) {
            if (items == it) {
                return true;
            }

        }
        return false;
    }

    public double getItemPrice(Item it) {

        double price = 0;

        for (Item items : item) {
            if (items == it) {
                return items.getPrice();
            }
        }
        throw new IllegalArgumentException("unable to find item");
    }

}

class TestBag {

    public static void main(String[] args) {

        Bag b = new Bag("WildCraft", 20);
        Item item1 = new Item("Cap", 10);
        Item item2 = new Item("NoteBook", 50);
        Item item3 = new Item("Pen", 15);
        Item item4 = new Item("TextBook", 100);
        Item item5 = new Item("Laptop", 10000);

        b.addItem(item1);
        b.addItem(item2);
        b.addItem(item3);
        b.addItem(item4);
        System.out.println(" no of items in the bag = " + b.count);
        System.out.println(" searchItem = " + b.searchItem(item4));
        System.out.println(" Individual price of item4 = " + b.getItemPrice(item4));
        System.out.println(" Individual price of item3 = " + b.getItemPrice(item3));
        // System.out.println(" Individual price of item3 = " + b.getItemPrice(item5));
        
    }
}