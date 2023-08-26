import java.io.Serializable;

public class Person implements Serializable {

    String name;
    int height;

    public Person() {

    }

    public Person(String name, int height) {

        this.name = name;
        this.height = height;

    }

    public boolean equals(Person p) {

        if (p instanceof Person) {

            if (this.name.equals(p.name) && this.height == p.height) {

                return true;

            }

        }
        return false;

    }

    public String toString() {

        return "name : " + name + " height : " + height;

    }

}

class TestHuman {

    public static void main(String[] args) {

        Person p1 = new Person("Ramu", 15);
        Person p2 = new Person("Ramu", 15);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1);

    }

}