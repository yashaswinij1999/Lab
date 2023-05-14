public class Food {

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

    public void setPrice() {
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid size");
        }
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
