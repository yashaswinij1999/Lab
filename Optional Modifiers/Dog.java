public class Dog {

    private int size;

    public void setSize(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Invalid size");
        }
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void bark() {
        if (size <= 30) {
            System.out.println("the dog barks");
        } else {
            System.out.println("the dog meows ");
        }
    }
}
