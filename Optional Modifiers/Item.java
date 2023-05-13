public class Item {

    double price;
    String name;
    int serialNo;

    {
        for (int i = 0; i < 1; i++) {
            serialNo = (int) (1000 * Math.random());
        }
        System.out.println(" item created with serial no =  " + serialNo);
    }

    public Item() {
        System.out.println("no arg constr ");

    }

    public Item(String name) {
        this.name = name;
        System.out.println("param contr with only name ");
    }

    public Item(String name, double price) {
        this(name);
        this.price = price;
        System.out.println("param constr with name and price ");
    }
}

class TestItem {

    public static void main(String[] args) {

        Item it = new Item("Cap", 10);
        Item it2 = new Item("Cap");
        Item it3 = new Item();
        Item it4 = new Item("Note", 10);

    }
}