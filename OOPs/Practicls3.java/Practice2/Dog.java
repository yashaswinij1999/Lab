public class Dog {

    private String name;
    private int size;

    public void setName(String name) {

        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Invalid name");
        } else {
            this.name = name;
        }

    }

    public String getName() {
        return name;
    }

    public void setSize(int size) {

        this.size = size;

    }

    public int getSize() {
        return size;
    }

    public void bark() {

        if (size > 0) {

            if (size > 10) {

                System.out.println(" the dog meows ");

            } else {

                for (int i = 1; i <= size; i++) {

                    System.out.println("the dog bow bow ");

                }

            }

        } else {

            System.out.println("size is less than zero please set the size");

        }

    }
}

class TestDog {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.setSize(2);
        d.bark();

    }

}
