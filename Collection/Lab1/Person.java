public class Person {

    private String name;
    private int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public boolean equals(Object e) {

        if (e instanceof Person) {
            Person p = (Person) e;

            if (this.name.equals(p.name) && this.height == p.height) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Person:" + name + "," + height;
    }

    public int hashCode() {
        return (name + height).hashCode();
    }

}

class TestPerson {

    public static void main(String[] args) {

        Person p1 = new Person("ram", 5);
        Person p2 = new Person("ram", 5);
        System.out.println("identity check = "+(p1==p2));
        System.out.println("p1.equals(p2) = " + p1.equals(p2));

    }
}