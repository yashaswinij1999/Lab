public class Bag {

    String name;
    Item[] item;
    static int count;

    public Bag() {

    }

    public Bag(String name, int size) {

        this.name = name;
        item = new Item[size];

    }

    public void addItem(Item it) {

        if (count < item.length) {
            item[count++] = it;
        }

    }

    public boolean search(String name) {

        for (Item it : item) {

            if (it.getName().equals(name)) {
                return true;
            }

        }
        return false;

    }

    public int getIndividualItemPrize(String name) {

        for (Item it : item) {

            if (it.getName().equals(name)) {
                return it.getPrize();
            }

        }
        return 0;

    }

    public Item getItem(int pos) {

        return item[pos];

    }

}

class TestBag {

    public static void main(String[] args) {

        Bag b = new Bag("Wildcraft", 20);

        Item it1 = new Cap("Reebok", 20);
        Item it2 = new Pen("Reynolds", 10);
        Item it3 = new LipStick("Maybeline", 150);

        b.addItem(it1);
        b.addItem(it2);
        b.addItem(it3);

        System.out.println("no of items in the bag = " + Bag.count);

        int prize = b.getIndividualItemPrize("Maybeline");
        System.out.println(" Item prize = " + prize);

        Item it = b.getItem(1);
        System.out.println("the Item in that position = " + it);

        try {
            System.out.println(b.getTotal());

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

}