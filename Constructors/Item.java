public class Item {

    private String name;
    private double price;

    public Item(){

    }

    public Item(String name, double price){
        this.setName(name);
        this.setPrice(price);
    }

    public void setName(String name) {

        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Invlaid price");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
