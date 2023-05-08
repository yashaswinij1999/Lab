public class Dog {

    private String name;
    private int size;

    public void setName(String name) {

        if (name == null || name.equals(" ")) {
            throw new IllegalArgumentException("Invalid name ");
        }
        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setSize(int size) {

        if (size < 0) {
            throw new IllegalArgumentException("Invalid size ");

        }
        this.size = size;
    }

    public int getSize() {

        return size;

    }

    public void bark() {

        if (size > 10) {

            System.out.println(" the dog meows ");

        } else {

            for (int i = 1; i < size; i++) {

                System.out.println(" dog bow bow name = " + name);

            }
        }

    }

}

class TestDogs {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.setName("Ramu");
        System.out.println(" getname = " + d1.getName());
        d1.setSize(3);
        d1.bark();

    }
}
