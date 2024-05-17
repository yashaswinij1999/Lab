
public class Item {

    String name;
    int price;

    public Item(String name, int price) {

        this.name = name;
        this.price = price;

    }

    public boolean equals(Object e) {
        if (e instanceof Item) {
            Item i = (Item) e;

            if (this.name.equals(i.name) && this.price == i.price) {
                return true;
            }

        }
        return false;

    }

    public int hashCode() {
        return (name + price).hashCode();
    }

}
