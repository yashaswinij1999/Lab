
public class Person {

    String name;
    int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
        System.out.println("paramterised constuctor");
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
        return "name " + " : " + this.name + " height :" + this.height;
    }

}

class TestPerson {

    public static void main(String[] args) {

        Person p1 = new Person("rama", 10);
        Person p2 = new Person("rama", 10);

        System.out.println(p1);
        System.out.println(p1.equals(p2));

    }

}
