public class Dog {

    private String name;
    private int size;

    public Dog() {
        System.out.println("no argument constructor in dog class");
    }

    public Dog(String name, int size) {
        this.setSize(size);
        this.setName(name);
        System.out.println(" param constructor in dog class ");
    }

    public void setName(String name) {

        if (name == null || name.equals("") || name.length() > 30) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSize(int size) {
        if (size < 0 || size > 100) {
            throw new IllegalArgumentException("Invalid size");
        }
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void bark() {

        if (size < 7) {

            for (int i = 1; i <= size; i++) {

                System.out.println("the dog barks");
            }

        } else {

            for (int i = 1; i <= size; i++) {

                System.out.println("the dog meows");
            }

        }
    }
}