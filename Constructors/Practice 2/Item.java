
public class Item {

    private String name;
    private int price;

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("invalid item name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("invalid price");
        }
        this.price = price;
    }

    public int getPrice(){
        return  price;
    }

    public Item(String name, int price) {
        setPrice(price);
        setName(name);
        System.out.println("parameterised constructor");
    }

}
